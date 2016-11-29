package com.krishveetee.springpocs.service;

import org.springframework.stereotype.Service;

@Service
public class SiPocService {
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!!");
    }

    public String getHelloMessage(String name){
        return ("Hello " + name + "!!");
    }

}
