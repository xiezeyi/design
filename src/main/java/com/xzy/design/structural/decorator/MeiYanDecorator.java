package com.xzy.design.structural.decorator;

/**
 * 美艳装饰器
 *  装饰谁
 *
 */
public class MeiYanDecorator implements TikTokDecorator{

    private ManTikTok manTikTok;
    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }
    @Override
    public void tiktok() {
        // 开启美颜效果
        enable();
        // 这里的enable的方法如果是其它类的方法，那么就是适配器的
        manTikTok.tiktok();
    }

    /**
     * 定义的增强功能，这个功能是在该类里的。
     */
    @Override
    public void enable() {
        System.out.println("看美女");
        System.out.println("花花花");
    }
}
