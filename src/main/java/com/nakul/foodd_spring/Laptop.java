package com.nakul.foodd_spring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Laptop Program is compiling");
    }
}
