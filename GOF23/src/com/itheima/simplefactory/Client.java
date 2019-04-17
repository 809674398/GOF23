package com.itheima.simplefactory;

public class Client {
    public static void main(String[] args) {
        Car aodi = SimpleFactory.createAudi();
        aodi.run();
        Car benz = SimpleFactory.createBenz();
        benz.run();
    }
}
