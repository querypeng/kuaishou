package com.kuaishou.demo.controller;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @author chy
 * @date 2019-02-23
 */
@Controller
public class DemoController {


    @GetMapping("demo1")
    @ResponseBody
    public String demo1() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://api.gifshow.com/rest/n/feed/hot?app=0&kpf=ANDROID_PHONE&ver=6.1&c=XIAOMI&mod=Xiaomi%28MIX%202%29&appver=6.1.1.8096&ftt=K-T-T&isp=CUCC&kpn=KUAISHOU&lon=121.307828&language=zh-cn&sys=ANDROID_8.0.0&max_memory=256&ud=1211439612&country_code=cn&oc=XIAOMI&hotfix_ver=&did_gt=1547968116027&iuid=&extId=c37f259c4d56246ff655c4627550fa26&net=WIFI&did=ANDROID_75eb73714a8769c6&lat=31.219055&type=7&page=1&coldStart=false&count=20&pv=false&id=14363&refreshTimes=2&pcursor=&source=1&needInterestTag=false&browseType=1&os=android&__NStokensig=da69a950da90cedfef80ebce0ca028d17df48314869431ad872333a97994e3e5&token=ecd7394b3383474a9f41098ce22b5b01-1211439612&sig=4070cf6a1c277303ccb700456848c447&client_key=3c2cd3f3");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String json=null;
        if(response.getStatusLine().getStatusCode()==200){
            json = EntityUtils.toString(response.getEntity(), "UTF-8");
        }
        return json;
    }
}
