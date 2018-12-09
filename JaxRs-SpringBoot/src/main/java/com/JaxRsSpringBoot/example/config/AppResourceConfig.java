package com.JaxRsSpringBoot.example.config;

import javax.ws.rs.ApplicationPath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

@ApplicationPath("/*")
@SpringBootApplication
public class AppResourceConfig {

  @Bean
  ResourceConfig resourceConfig() {
      return new ResourceConfig()
                 .packages("com.JaxRsSpringBoot.example.controller")
                 .register(JacksonFeature.class);
  }

  public static void main(String[] args) {
      SpringApplication.run(AppResourceConfig.class);
  }

}
