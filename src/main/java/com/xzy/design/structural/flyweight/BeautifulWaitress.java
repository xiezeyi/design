package com.xzy.design.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{

    String id;
    String name;
    int age;
    // 以上是不变的


    @Override
    void service() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("正在服务");
        // 改变外部状态
        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("结束服务");
        this.canService = true;
    }
}
