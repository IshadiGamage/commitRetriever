package com.pearson.commitRetriever;

import com.pearson.commitRetriever.services.CommitRetrieverServiceIntegration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import javax.inject.Inject;
import java.util.Arrays;

public class HttpUtil {

    private String token= "UGMAIS";
    private String pwrd = "Ok@10877@";

//    @Inject
//    CommitRetrieverServiceIntegration commitRetrieverServiceIntegration;


    public static HttpHeaders getHttpHttpHeaders(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("X-AUSERID", "256853");
        headers.add("Authorization", "Basic VUdBTUFJUzpPa0AxMDg3N0A=");
        headers.add("Cache-Control", "no-cache");

        return headers;
    }
}
