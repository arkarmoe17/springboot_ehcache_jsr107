package com.example.springboot_ehcaching.service;

import org.springframework.cache.annotation.Cacheable;

public interface StudentService {
    @Cacheable(value = "student", key = "#name")
    String getName(String name);
}
