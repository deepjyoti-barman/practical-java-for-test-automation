package com.naveenautomationlabs.pattern.factory.basic;

public class SUV implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a SUV");
    }
}
