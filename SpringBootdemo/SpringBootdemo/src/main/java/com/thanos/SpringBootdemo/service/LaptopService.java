package com.thanos.SpringBootdemo.service;

import com.thanos.SpringBootdemo.model.Laptop;
import com.thanos.SpringBootdemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopService {
    @Autowired
    private LaptopRepository repository;

    public LaptopService(){
        System.out.println("LaptopSrrvice created");
    }

    public void addLaptop(Laptop lap) {
        System.out.println("Method called");
        repository.save(lap);
    }
    public boolean isGoodforProg(Laptop lap){
        return true;
    }
}