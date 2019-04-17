package com.itheima.factorymethod;

/**
 * 奔驰工厂
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
