package com.boyce.cloud.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Moon {
    public static void main(String[] args) {
        SpringApplication.run(Moon.class, args);
    }
}