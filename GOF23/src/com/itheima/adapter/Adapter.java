package com.itheima.adapter;

/**
 * 适配器类
 * @author 周思聪
 * @date 2019/4/8 11:32
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapter() {
        adaptee.work();
    }
}
