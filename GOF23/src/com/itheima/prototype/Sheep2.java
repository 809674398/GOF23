package com.itheima.prototype;

import java.util.Date;

/**
 * @author 周思聪
 * @date 2019/4/7 21:26
 */
public class Sheep2 implements Cloneable{
    private String name;
    private Date birtyday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //实现深克隆
       Sheep2 s2 =  (Sheep2)obj;
       s2.birtyday = (Date) this.birtyday.clone();

        return obj;
    }

    public Sheep2(String name, Date birtyday) {
        this.name = name;
        this.birtyday = birtyday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtyday() {
        return birtyday;
    }

    public void setBirtyday(Date birtyday) {
        this.birtyday = birtyday;
    }


}
