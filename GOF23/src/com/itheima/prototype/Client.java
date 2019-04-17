package com.itheima.prototype;

import java.util.Date;

/**
 * 测试原型模式(浅克隆)
 * @author 周思聪
 * @date 2019/4/7 21:30
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(100000000L);
        Sheep s1 = new Sheep("老羊", date);
        //浅克隆
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirtyday());
        date.setTime(20000000L);
        System.out.println("原对象修改后的时间"+s1.getBirtyday());


        s2.setName("小羊");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirtyday());

    }
}
