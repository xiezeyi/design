package com.xzy.design.structural.proxy.statics;

/**
 * 2.subject 主体
 * 需求 我不想上课了，找个人来帮我上课
 */
public class XieTikTok implements ManTikTok
{
    @Override
    public void tiktok() {
        System.out.println("谢某，tiktok....");
    }
}
