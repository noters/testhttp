package com.test.http;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.client.utils.DateUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HttpDownload {

    private String startText = "<a href";
    private String endText = "</a>";
    private String startHtml = "=\"";
    private String endHtml = "\">";

    private String head = "http";
    private String endHref = "/";
    private String[] ext = {".pom", ".jar"};

    private String mav_repository = "maven_repository";

    private String http_url;

    private String ext_md5 = ".md5";

    private HttpClientProvider httpClientProvider = new HttpClientProvider();
    private List<String> hrefList = new ArrayList<>();
    private List<String> resultList = new ArrayList<>();

    public void setHttpUrl(String url) {
        http_url = url;
    }

    public void setResultList(List<String> resultList) {
        this.resultList = resultList;
    }

    private List<String> addHref(String url) throws Exception {
        //String response = httpClientProvider.httpPost(url, null);
        String response = httpClientProvider.doGet(url);
        return getHtmlHref(response);
    }

    public void start(String url) throws Exception {
        setHttpUrl(url);
        hrefList = addHref(url);
        while (hrefList.size() > 0) {
            List<String> list = new ArrayList<>();
            List<String> deleteList = new ArrayList<>();
            for (String href : hrefList) {
                deleteList.add(href);
                List<String> tempList = addHref(href);
                list.addAll(tempList);
            }
            hrefList.addAll(list);
            for (int i = hrefList.size() - 1; i >= 0; i --) {
                String text = hrefList.get(i);
                for (String deleteText : deleteList) {
                    if (text.equals(deleteText)) {
                        hrefList.remove(i);
                    }
                }
            }
        }
    }

    public void printResult() {
        for (String resultText : resultList) {
            System.out.println(resultText);
        }
    }

    private List<String> getHtmlHref(String html) {
        List<String> list = new ArrayList<>();
        if (html != null && !"".equals(html)) {
            String[] itemArray = html.split(endText);
            for (String item : itemArray) {
                int index = item.indexOf(startText);
                if (index >= 0) {
                    int endIndex = item.lastIndexOf(endHtml);
                    String text = item.substring(index + startText.length() + startHtml.length(), endIndex);
                    if (text.startsWith(head)) {
                        if (text.endsWith(endHref)) {
                            list.add(text);
                        } else {
                            for (String extText : ext) {
                                if (text.endsWith(extText)) {
                                    resultList.add(text);
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public void writeFile(String path) throws Exception {
        String nowPath = path + File.separator + mav_repository + File.separator;
        for (String url : resultList) {
            String fileName = url.replace(http_url, nowPath);
            String dataString = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss.SSS");
            //System.out.println(dataString + " -> " + url + " -> " + fileName);
            httpClientProvider.downloadFile(url, fileName);

            String httpMd5 = httpClientProvider.doGet(url + ext_md5);
            String md5 = DigestUtils.md5Hex(new FileInputStream(fileName));
            if (httpMd5.equals(md5)) {
                System.out.println(dataString + " -> " + "md5 match" + " -> " + url + " -> " + fileName);
            } else {
                System.out.println(dataString + " -> " + httpMd5 + " -> " + md5 + " -> " + url + " -> " + fileName);
            }
        }
    }
}
