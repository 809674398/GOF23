package com.itheima.prototype;

import java.util.Date;

/**
 * @author 周思聪
 * @date 2019/4/7 21:26
 */
public class Sheep implements Cloneable{
    private String name;
    private Date birtyday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

    public Sheep(String name, Date birtyday) {
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
