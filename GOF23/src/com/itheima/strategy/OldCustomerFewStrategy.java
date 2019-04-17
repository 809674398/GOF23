package com.itheima.strategy;

/**
 * @author 周思聪
 * @date 2019/4/8 16:00
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        return price*0.8;
    }
}
