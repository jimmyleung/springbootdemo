package com.jimmy.springboot.demo.controller;

import com.jimmy.springboot.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//19.3
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private OrderService orderService;

    @Value("${my.randomInt}")
    private Integer randomInt;

    @RequestMapping("/sayHi")
    public String sayHi() {
        System.out.println(orderService.findById(1L));
        return "Hello World spring boot";
    }
}
