package com.covalense.coreJavaApp.inheritance;

public class Father {
    void bike()
    {
    	System.out.println("Simple Bike");
    }
}
 class Son extends Father {
    void bike()
    {
    	System.out.println("Modified Bike");
    }
}

