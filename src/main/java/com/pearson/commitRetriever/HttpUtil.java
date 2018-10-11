package com.pearson.commitRetriever;

import com.pearson.commitRetriever.services.CommitRetrieverServiceIntegration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import javax.inject.Inject;
import java.util.Arrays;

import static com.pearson.commitRetriever.constants.Constants.PWRD;
import static com.pearson.commitRetriever.constants.Constants.USERNAME;

public class HttpUtil {

    @Inject
    CommitRetrieverServiceIntegration commitRetrieverServiceIntegration;

    public String getToken(){
        String tok = commitRetrieverServiceIntegration.BasicAuth(USERNAME,PWRD);
        return tok;
    }


    public static HttpHeaders getHttpHttpHeaders(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("X-AUSERID", "256853");
        headers.add("Authorization", "Basic VUdBTUFJUzpPa0AxMDg3N0A=");
        headers.add("Cache-Control", "no-cache");

        return headers;
    }
}
