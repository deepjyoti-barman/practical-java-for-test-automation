package com.naveenautomationlabs.pattern.factory.basic;

public class TestCar {

    public static void main(String[] args) {

        // Factory pattern is complete isolation of the object creation
        // It is used to create objects without exposing the creation logic to the client
        // As per requirement later on N number of classes can be added to the factory
        CarFactory factory = new CarFactory();

        Car suv = factory.getCar("SUV");
        suv.assemble();

        Car sedan = factory.getCar("Sedan");
        sedan.assemble();

        Car truck = factory.getCar("Truck");
        truck.assemble();
    }
}
