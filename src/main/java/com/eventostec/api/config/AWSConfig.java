package com.eventostec.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AWSConfig {

  @Value("${aws.region}")
  private String awsRegion;

  @Bean
  public AmazonS3 createS3Instance(AWSCredentialsProvider credentialsProvider){
    AmazonS3ClientBuilder.standard();
    return AmazonS3ClientBuilder
            .standard()
            .withCredentials(credentialsProvider)
            .withRegion(awsRegion)
            .build();
  }
}
