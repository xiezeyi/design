package com.xzy.design.structural.proxy.dynamic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 动态代理模式
 *
 * 代理对象和目标对象的相同点在于都是同一个接口
 * jdk必须要有接口，没有接口就会报错
 */
public class MainText {
    public static void main(String[] args) {
        ManTikTok xieTikTok =  new XieTikTok();
        ManTikTok proxy = JdkTiktokProxy.getProxy(xieTikTok);

        proxy.tiktok();

        // 动态代理其它接口的方法
        ((SellTikTok)proxy).sell();

        // 能不能代理被代理对象本类自己的方法,这里会报错,只能转成接口
        ((XieTikTok)proxy).haha();
        // 这里可以看到转的接口只有两个
        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));

    }
}
