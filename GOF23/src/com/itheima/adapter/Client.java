package com.itheima.adapter;

/**
 * 客户类,相当于笔记本调用键盘例子中的笔记本
 * @author 周思聪
 * @date 2019/4/8 11:33
 */
public class Client {


    public static void main(String[] args) {
        //将被适配的类传到适配器中,就可以调用被适配类中的方法
        Adaptee adaptee = new Adaptee();//被适配的类
        Target t = new Adapter(adaptee);//适配器
        t.adapter();
    }

}
