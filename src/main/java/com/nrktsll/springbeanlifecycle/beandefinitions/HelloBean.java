package com.nrktsll.springbeanlifecycle.beandefinitions;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void Hello() {
        System.out.println("Hello bean");
    }
}
