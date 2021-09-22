package com.xzy.design.structural.decorator;

public class MainTest {
    public static void main(String[] args) {
        // 被装饰对象
        ManTikTok manTikTok = new XieTikTok();
        manTikTok.tiktok();
        // 这里会发现和适配器很相似
        // 但要看清，装饰器中的MeiYanDecorator的功能增加是在装饰器里面写的，所以只增强抖音直播主播，
        // 即装饰器只关心增强这个类的方法
        MeiYanDecorator meiYanDecorator = new MeiYanDecorator(manTikTok);
        meiYanDecorator.tiktok();
    }
}
