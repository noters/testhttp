package com.test.http;

public class TestMain {

    public static void main(String ... args) throws Exception {
        String url = "http://192.168.108.51/nexus/content/repositories/releases/";

        String path = "F:\\QQDownload";

        HttpDownload httpDownload = new HttpDownload();
        httpDownload.start(url);

        httpDownload.printResult();

        System.out.println();
        System.out.println("----------");
        httpDownload.writeFile(path);

    }
}
