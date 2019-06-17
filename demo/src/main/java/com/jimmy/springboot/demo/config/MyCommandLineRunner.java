package com.jimmy.springboot.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    //如果您需要在 SpringApplication 启动后运行某些特定代码，则可以实现 ApplicationRunner 或 CommandLineRunner 接口
    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringApplication.run之后马上执行MyCommandLineRunner");
    }
}
