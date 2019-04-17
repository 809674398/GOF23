package com.itheima.strategy;

/**
 * @author 周思聪
 * @date 2019/4/8 16:03
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new OldCustomerManyStrategy();
        Context context  = new Context(strategy);
        context.getPrice(10000);
    }
}
