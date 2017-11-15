package com.crw.springbootstartertest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootStarterTestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootStarterTestApplication.class).web(true).run(args);
    }
}
