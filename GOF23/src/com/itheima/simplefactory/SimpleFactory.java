package com.itheima.simplefactory;

/**
 * 简单工厂
 */
public class SimpleFactory {
    /**
     * 生产奥迪的方法
     * @return
     */
   public static Car createAudi(){
       return new Audi();
   }

    /**
     * 生产奔驰的方法
     * @return
     */
   public static Car createBenz(){
       return new Benz();
   }



}
