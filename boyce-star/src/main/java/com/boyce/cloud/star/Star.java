package com.boyce.cloud.star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Star {
    public static void main(String[] args) {
        SpringApplication.run(Star.class, args);
    }
}