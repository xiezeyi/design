package com.xzy.design.structural.flyweight;

/**
 * 抽象享元类
 */
public abstract class AbstractWaitressFlyweight {
    boolean canService = true;// 能否服务


    // 这两个都是不共享的

    // 正在服务 享元的不可共享属性留给外部进行改变的接口
    abstract void service();

    // 服务完成 享元的不可共享属性留给外部进行改变的接口
    abstract void end();

    // 需要提供外部改变的方法！！！！！！！！1
    public boolean isCanService() {
        return canService;
    }
}
