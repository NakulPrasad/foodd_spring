package com.nakul.foodd_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Computer comp ;
    public void build (){
        System.out.println("Product Build is working");
        comp.compile();
    }
}
