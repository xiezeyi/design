package com.xzy.design.structural.bridge;


public class HuaWeiPhone extends AbstractPhone {
    @Override
    String getPhone() {
        return "华为手机"+sale.getSaleInfo();
    }
}
