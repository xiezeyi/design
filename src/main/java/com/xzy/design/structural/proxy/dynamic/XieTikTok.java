package com.xzy.design.structural.proxy.dynamic;

/**
 * 2.subject 主体
 * 需求 我不想上课了，找个人来帮我上课
 */
public class XieTikTok implements ManTikTok,SellTikTok
{
    @Override
    public void tiktok() {
        System.out.println("谢某，tiktok....");
    }

    @Override
    public void sell() {
        System.out.println("谢某 卖货");
    }

    public void haha() {
        System.out.println("谢某 哈哈");
    }
}
