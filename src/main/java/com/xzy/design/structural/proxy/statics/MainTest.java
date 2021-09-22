package com.xzy.design.structural.proxy.statics;

public class MainTest {
    public static void main(String[] args) {
        TikTokProxy tikTokProxy = new TikTokProxy(new XieTikTok());
        tikTokProxy.tiktok();

        // 这里会发现和装饰器模式好像
        // 静态代理就是装饰器
        // 一般说装饰器模式是代理模式的一种
    }
}
