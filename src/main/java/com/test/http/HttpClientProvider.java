package com.test.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HttpClientProvider {

    private Boolean isRequestSuccess(HttpResponse httpresponse){
        return httpresponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
    }

    public String httpPost(String url, Map<String,String> paramMap) throws Exception{
        String response;
        List<NameValuePair> list = new LinkedList<>();
        if (paramMap != null) {
            for (Map.Entry<String, String> entry : paramMap.entrySet()) {
                list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        HttpPost httpPost = new HttpPost(url);
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(list,"utf-8");
        httpPost.setEntity(formEntity);
        HttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpresponse;
        try{
            httpresponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpresponse.getEntity();
            response = EntityUtils.toString(httpEntity, "utf-8");
        } catch(IOException e){
            throw new Exception("http请求失败, url = " + url, e);
        }
        return response;
    }

    public String doGet(String url) {
        String strResult = null;
        try {
            HttpClient client = HttpClients.createDefault();
            //发送get请求
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);
            //请求发送成功，并得到响应
            if (isRequestSuccess(response)) {
                //读取服务器返回过来的字符串数据
                strResult = EntityUtils.toString(response.getEntity());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return strResult;
    }

    public void downloadFile(String url, String dest_file) throws Exception {
        int downloadTimeout = 30 * 1000;
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            httpget.setConfig(RequestConfig.custom()
                    .setConnectionRequestTimeout(downloadTimeout)
                    .setConnectTimeout(downloadTimeout)
                    .setSocketTimeout(downloadTimeout)
                    .build());
            CloseableHttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            File desc = new File(dest_file);
            File folder = desc.getParentFile();
            if (!folder.exists()) {
                boolean flag = folder.mkdirs();
            }
            InputStream is = entity.getContent();
            OutputStream os = new FileOutputStream(desc);
            IOUtils.copy(is, os);
            os.flush();
            is.close();
            os.close();
        } catch (Exception e) {
            throw new Exception("文件下载失败......", e);
        }
    }

}
