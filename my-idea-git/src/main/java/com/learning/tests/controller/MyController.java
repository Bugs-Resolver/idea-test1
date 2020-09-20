package com.learning.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test1")
    public String test1(){
        System.out.println("working");
        System.out.println("update1");
        System.out.println("update2");
        return "success";
    }
}
