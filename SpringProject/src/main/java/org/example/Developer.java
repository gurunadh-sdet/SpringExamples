package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Developer {
    @Value("25")
    private int age;
   // @Autowired
    //@Qualifier("desktop")
    private Computer com;

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Developer(){
        System.out.println("Developer object created");
    }

    public void code(){
        System.out.println("Developer coding..");
        com.compile();
    }
}
