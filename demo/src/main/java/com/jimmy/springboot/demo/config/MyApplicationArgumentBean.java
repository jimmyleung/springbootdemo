package com.jimmy.springboot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class MyApplicationArgumentBean {
    //18.您需要访问传递给 SpringApplication.run(… ) 的应用程序参数，则可以注入一个 org.springframework.boot.ApplicationArguments bean
    @Autowired
    public MyApplicationArgumentBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        Set<String> options = args.getOptionNames();
        System.out.println("debug" + debug);
        System.out.println("options" + options);


    }

}
