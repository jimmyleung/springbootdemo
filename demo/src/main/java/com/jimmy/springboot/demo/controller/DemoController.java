package com.jimmy.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//19.3
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/sayHi")
    public String sayHi() {
        return "Hello World";
    }
}
