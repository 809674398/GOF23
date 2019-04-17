package com.itheima.factorymethod;

public class Client {
    public static void main(String[] args) {
        Car aodi = new AudiFactory().createCar();
        aodi.run();
    }
}
