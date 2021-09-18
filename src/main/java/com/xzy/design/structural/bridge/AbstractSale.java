package com.xzy.design.structural.bridge;

/**
 * 2.抽象销售渠道
 *
 * 这里如果不使用桥接
 * 每一种渠道，都需要在渠道类中至少新增一个相同的销售方法，如
 * 线上渠道 线下渠道等等  违背了开闭有厕
 */
public abstract class AbstractSale {

    private String type;
    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo(){
        return "渠道："+type+"==>"+"价格"+price;
    }
}
