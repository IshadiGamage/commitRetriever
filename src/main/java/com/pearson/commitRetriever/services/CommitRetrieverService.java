package com.pearson.commitRetriever.services;


import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Service
public class CommitRetrieverService {

    public String url = "https://bitbucket.pearson.com/rest/api/latest/projects/WSLAUTO/repos/wsol-student-submission-simulator/commits/e2f4d046e5010e4d004abf5174bce55e98858493";

    @Inject
    CommitRetrieverServiceIntegration commitRetrieverServiceIntegration;

    @PostConstruct
            public void bla(){
        commitRetrieverServiceIntegration.test(url);
    }

}
