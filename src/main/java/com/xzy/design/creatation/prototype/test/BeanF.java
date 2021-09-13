package com.xzy.design.creatation.prototype.test;

public class BeanF implements Cloneable{
    private String name;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String name5;
    private String name6;
    private String name7;
    private String name8;
    private String name9;
    private String name10;
    private String name11;
    private String name12;

    public BeanF() {
        this.name = "name";
        if (name.length() != 0) {
            name1 = name.substring(0, 1);
            name1 += "abc";
        }
    }

    public BeanF(String name, String name1, String name2, String name3, String name4, String name5, String name6, String name7, String name8, String name9, String name10, String name11, String name12) {
        this.name = name;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
        this.name6 = name6;
        this.name7 = name7;
        this.name8 = name8;
        this.name9 = name9;
        this.name10 = name10;
        this.name11 = name11;
        this.name12 = name12;
    }

    @Override
    protected BeanF clone() throws CloneNotSupportedException {
        return (BeanF) super.clone();
    }
}
