package com.xzy.design.structural.facade;

public class WeiXinFacade {

    Poblic poblic = new Poblic();
    Edu edu = new Edu();
    Social social = new Social();

    /**
     * 封装起来只留一个方法
     *
     * @param name
     */
    public void handle(String name) {
        poblic.register(name);
        edu.assignSchool(name);
        social.handleSocial(name);
    }

    /**
     * 也可以这样，不过有点像装饰器？？自己写的
     */
    public void register(String name) {
        poblic.register(name);
    }
}
