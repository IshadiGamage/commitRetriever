package com.pearson.commitRetriever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommitRetrieverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommitRetrieverApplication.class, args);
		System.out.println("===== Application is running =====");
	}
}
