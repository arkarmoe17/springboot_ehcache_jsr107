package com.example.springboot_ehcaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEhcachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEhcachingApplication.class, args);
    }

}
