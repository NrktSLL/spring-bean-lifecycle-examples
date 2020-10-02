package com.nrktsll.springbeanlifecycle.beandefinitions;

public class MyCustomBean {

    public void customInit() {
        System.out.println("* customInit executed *");
    }

    public void customDestroy() {
        System.out.println("* customDestroy executed *");
    }

    public void beforeInit() {
        System.out.println("-Custom Before Initialization called method-" + "\n");
    }

    public void afterInit() {
        System.out.println("-Custom After Initialization called method-" + "\n");
    }

    public void Hello() {
        System.out.println("Hello");
    }
}
