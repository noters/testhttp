package com.test.http;

import java.util.ArrayList;
import java.util.List;

public class TestMainTg {

    public static void main(String ... args) throws Exception {
        String url = "http://192.168.6.2:8081/repository/maven-releases/";

        String path = "F:\\QQDownload";

        List<String> list = new ArrayList<>();
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc6/11.2.0.1.0/ojdbc6-11.2.0.1.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc6/11.2.0.4/ojdbc6-11.2.0.4.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc7/12.1.0.2.0/ojdbc7-12.1.0.2.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-client/2.5.0/p-auth-client-2.5.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-common/2.5.0/p-auth-common-2.5.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-core/2.5.0/p-auth-core-2.5.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-server/2.5.0/p-auth-server-2.5.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-template/2.5.0/p-auth-template-2.5.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auto-config/2.2.3-RELEASE/p-auto-config-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-common/2.2.3-RELEASE/p-common-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-core/2.2.3-RELEASE/p-core-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-dao/2.2.3-RELEASE/p-dao-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-manager/2.2.3-RELEASE/p-manager-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-rpc-core/1.3.6/p-rpc-core-1.3.6.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-web-core/2.2.3-RELEASE/p-web-core-2.2.3-RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-allinpay.jar/1.0.0/pay-allinpay.jar-1.0.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-allinpay/1.0.0/pay-allinpay-1.0.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-pingan-emp/1.0.0.RELEASE/pay-pingan-emp-1.0.0.RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-pingan/1.0.0.RELEASE/pay-pingan-1.0.0.RELEASE.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-zhifu/2.7.10/pay-zhifu-2.7.10.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-zzbank/1.0.0/pay-zzbank-1.0.0.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/json/json-util/2.2.2/json-util-2.2.2.pom");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc6/11.2.0.1.0/ojdbc6-11.2.0.1.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc6/11.2.0.4/ojdbc6-11.2.0.4.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/oracle/ojdbc7/12.1.0.2.0/ojdbc7-12.1.0.2.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-client/2.5.0/p-auth-client-2.5.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-common/2.5.0/p-auth-common-2.5.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auth-core/2.5.0/p-auth-core-2.5.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auto-config/2.2.3-RELEASE/p-auto-config-2.2.3-RELEASE-sources.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-auto-config/2.2.3-RELEASE/p-auto-config-2.2.3-RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-common/2.2.3-RELEASE/p-common-2.2.3-RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-core/2.2.3-RELEASE/p-core-2.2.3-RELEASE-sources.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-core/2.2.3-RELEASE/p-core-2.2.3-RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-dao/2.2.3-RELEASE/p-dao-2.2.3-RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-rpc-core/1.3.6/p-rpc-core-1.3.6.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-web-core/2.2.3-RELEASE/p-web-core-2.2.3-RELEASE-sources.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/com/puzzle/p-web-core/2.2.3-RELEASE/p-web-core-2.2.3-RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-allinpay.jar/1.0.0/pay-allinpay.jar-1.0.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-allinpay/1.0.0/pay-allinpay-1.0.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-pingan-emp/1.0.0.RELEASE/pay-pingan-emp-1.0.0.RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-pingan/1.0.0.RELEASE/pay-pingan-1.0.0.RELEASE.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-zhifu/2.7.10/pay-zhifu-2.7.10.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/e-touch-dependencies/pay-zzbank/1.0.0/pay-zzbank-1.0.0.jar");
        list.add("http://192.168.6.2:8081/repository/maven-releases/json/json-util/2.2.2/json-util-2.2.2-jdk15.jar");

        HttpDownload httpDownload = new HttpDownload();
        httpDownload.setHttpUrl(url);
        httpDownload.setResultList(list);

        httpDownload.writeFile(path);
    }
}
