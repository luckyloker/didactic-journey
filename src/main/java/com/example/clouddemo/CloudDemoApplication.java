package com.example.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CloudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoApplication.class, args);
    }

}
