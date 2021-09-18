package com.xzy.design.structural.bridge;

/**
 * 桥接是省去了类的创建
 */
public class MainTest {
    public static void main(String[] args) {
        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        //原本的渠道需要使用不同的手机和渠道类去创建，现在只需要一一匹配即可,此时渠道可以随便换
        huaWeiPhone.setSale(new OfflinSale("线下渠道",9999));

        String phone = huaWeiPhone.getPhone();
        System.out.println("phone = " + phone);
    }
}
