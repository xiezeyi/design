package com.xzy.design.creatation.prototype.test;

public class Bean implements Cloneable{
    private String name;

    public Bean() {
//        System.out.println("调用了bean构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Bean clone() throws CloneNotSupportedException {
        return (Bean) super.clone();
    }
}
