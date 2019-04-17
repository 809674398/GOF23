package com.itheima.singleton;


/**
 * 测试懒汉式单例
 */
public class SingletonDemo2 {
    //1.提供静态私有变量
    private static SingletonDemo2 instance;
    //2.构造器私有化
    private SingletonDemo2(){

    }
    //3.提供访问该实例的方法(需要加同步锁)
    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
