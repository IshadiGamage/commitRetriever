package com.pearson.commitRetriever.services;


import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Service
public class CommitRetrieverService {

    public String url = "https://bitbucket.pearson.com/rest/api/latest/projects/WSLAUTO/repos/wsol-student-submission-simulator/commits/";

    @Inject
    CommitRetrieverServiceIntegration commitRetrieverServiceIntegration;

    @PostConstruct
    public void RetrieveCommits(){
        commitRetrieverServiceIntegration.getCommits(url);
    }

}
