package com.naveenautomationlabs.pattern.factory.basic;

public class Truck implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a Truck");
    }
}
