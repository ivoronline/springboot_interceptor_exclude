package com.ivoronline.springboot_interceptor_exclude.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //===================================================================
  // FILTERED
  //===================================================================
  @RequestMapping("Filtered")
  String filtered() {
    System.out.println("CONTROLLER: Filtered");
    return "Hello from Filtered Endpoint";
  }

  //===================================================================
  // NOT FILTERED
  //===================================================================
  @RequestMapping("NotFiltered")
  String notFiltered() {
    System.out.println("CONTROLLER: NOT Filtered");
    return "Hello from NOT Filtered Endpoint";
  }

}
