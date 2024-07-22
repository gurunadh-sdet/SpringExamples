package com.thanos.SpringBootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Created");
    }
    public void compile(){
        System.out.println("Laptop compliing...");
    }
}
