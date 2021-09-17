package com.xzy.design.structural.adaptor;

/**
 * 4.测试方法
 *
 * 这里是一般的播放器，与适配器无关
 * 适配器请看clazz和obj包下的内容
 *
 * 适配器
 * 1.系统原有两个已存在接口play,translate没有关系
 *
 * 需求 现在需要让一个小的日本友人，看电影时翻译成日文
 *
 * 2.我们在不改变原有系统的基础上实现这个功能就需要一个适配器
 *
 * 系统原来存在的所有接口都不能动，扩展一个新的类，来连接两个不同的类
 */
public class MainTest {
    public static void main(String[] args) {
        //1.日本人想看电影带日文字幕
        MoviePlayer moviePlayer = new MoviePlayer();
        moviePlayer.play();
    }
}
