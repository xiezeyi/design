package com.xzy.design.creatation.factory.abstractfactory;

public class N95Mask extends AbstractMask{

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectedMe() {
        System.out.println("n95口罩超级防护");
    }
}
