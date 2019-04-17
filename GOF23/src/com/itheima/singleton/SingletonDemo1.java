package com.itheima.singleton;


/**
 * 测试饿汉式单例
 */
public class SingletonDemo1 {
    //1.提供私有静态的变量,指向该类的对象
    private static SingletonDemo1 s = new SingletonDemo1();
    //2.构造器私有化
    private SingletonDemo1(){
    }
    //3.提供公共的静态方法,返回该类的实例
    public static SingletonDemo1 getInstance(){
        return s;
    }

}
