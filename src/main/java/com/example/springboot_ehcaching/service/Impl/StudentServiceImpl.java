package com.example.springboot_ehcaching.service.Impl;

import com.example.springboot_ehcaching.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String getName(String name) {
        System.out.println("Name:"+name);
        return "Hello "+name;
    }
}
