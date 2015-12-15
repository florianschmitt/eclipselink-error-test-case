package com.explicatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.explicatis")
public class EclipseErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EclipseErrorApplication.class, args);
    }
}
