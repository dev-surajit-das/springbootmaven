package com.surajit.springbootmaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String printHelloWorld() {
    return "Hello, World!";
  }

  @GetMapping("/devtools")
  public String printDevtools() {
    return "Hi, There!";
  }
}
