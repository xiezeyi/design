package com.xzy.design.structural.proxy.statics;

/**
 * 代理的东西不一样，每一种不同的被代理类Person,Dog,Cat，这里就需要创建不同的类，使用动态代理可以更好的解决该情况
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy tikTokProxy = new TikTokProxy(new XieTikTok());
        tikTokProxy.tiktok();

        // 这里会发现和装饰器模式好像
        // 静态代理就是装饰器
        // 一般说装饰器模式是代理模式的一种
    }
}
