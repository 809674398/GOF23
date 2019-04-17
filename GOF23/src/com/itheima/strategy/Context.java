package com.itheima.strategy;

/**
 * 上下文类,用来和具体的策略类交互
 * @author 周思聪
 * @date 2019/4/8 16:01
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void getPrice(double price){
        System.out.println("这边给您的报价为:"+strategy.getPrice(price));
    }
}
