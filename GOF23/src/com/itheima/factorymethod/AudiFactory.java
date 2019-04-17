package com.itheima.factorymethod;

/**
 * 奥迪工厂类
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
