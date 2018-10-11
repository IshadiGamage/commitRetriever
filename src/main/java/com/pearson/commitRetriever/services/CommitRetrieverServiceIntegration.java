package com.pearson.commitRetriever.services;

import com.pearson.commitRetriever.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Service
public class CommitRetrieverServiceIntegration {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    public String BasicAuth(String token, String secret){
        String tok = Base64.getEncoder().encodeToString((token + ":" + secret).getBytes());
        String Basic_token = "Basic " + tok;
        return Basic_token;

    }

    public String getCommits(String url){

        HttpHeaders header = HttpUtil.getHttpHttpHeaders();
        HttpEntity<String> commitEntity = new HttpEntity<>(header);

        ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.GET, commitEntity, String.class);
        HttpStatus statusCode = resp.getStatusCode();
        if (statusCode.is2xxSuccessful()){
            System.out.println("Success");
        }
        else{
            System.out.println("Not successfull");
        }

        String body = resp.getBody();
        System.out.println(body);
        return body;
    }


}
