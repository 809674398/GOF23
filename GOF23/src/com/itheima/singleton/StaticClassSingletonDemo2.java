package com.itheima.singleton;


/**
 * 测试静态内部类方式实现单例
 */
public class StaticClassSingletonDemo2 {
    private static class Instance{
        private static final StaticClassSingletonDemo2 instance = new StaticClassSingletonDemo2();
    }

    //2.构造器私有化
    private StaticClassSingletonDemo2(){

    }
    public static StaticClassSingletonDemo2 getInstance(){
        return Instance.instance;
    }
}
