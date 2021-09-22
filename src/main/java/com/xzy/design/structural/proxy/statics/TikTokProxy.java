package com.xzy.design.structural.proxy.statics;

/**
 * 3 .代理一般都是和被代理对象属于同一接口
 */
public class TikTokProxy implements ManTikTok{

    private ManTikTok manTikTok;// 被代理对象
    public TikTokProxy(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    /**
     * 代理 我想咋干就咋干
     */
    @Override
    public void tiktok() {
        // 增强功能
        System.out.println("渲染直播间");
        System.out.println("武汉正在直播");
        manTikTok.tiktok();
    }
}
