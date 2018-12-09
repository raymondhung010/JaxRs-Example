package com.JaxRsSpringBoot.example.controller;

import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/sample")
public class SampleController {

  @GET
  public String getMessage() {
      return "Hello World to Spring Boot Jax-Rs";
  }

}
