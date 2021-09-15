package com.xzy.design.creatation.factory.abstractfactory;

public class CommonMask extends AbstractMask {

    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protectedMe() {
        System.out.println("普通口罩");
    }
}
