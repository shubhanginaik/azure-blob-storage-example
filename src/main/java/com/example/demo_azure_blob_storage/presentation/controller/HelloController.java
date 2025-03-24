package com.example.demo_azure_blob_storage.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return "Hello, " + name + "!";
  }
}
