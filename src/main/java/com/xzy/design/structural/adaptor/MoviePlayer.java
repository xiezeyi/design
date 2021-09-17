package com.xzy.design.structural.adaptor;

/**
 * 3.电影播放器
 * 阅读器
 * 。。。
 */
public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放：ssss");
        String content = "你好";
        System.out.println(content);//并打印出字幕
        return content;
    }
}
