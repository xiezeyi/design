package com.xzy.design.creatation.builder;

public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();

        // 建造这个手机
//        builder.customMem("16G");
//        builder.customDisk("1T");
//        builder.customCam("2亿");
//        builder.customCpu("xiaolong");
//
//        Phone product = builder.getProduct();
//
//        System.out.println(product.toString());

//        Phone phone = builder.
//                customMem("16G").
//                customDisk("1T").
//                customCam("2亿").
//                customCpu("xiaolong")
//                .getProduct();
//        System.out.println(phone);

        Phone phoneBuilder = Phone.builder()
                .cpu("1")
                .cam("2")
                .mem("3")
                .disk("4")
                .build();
        System.out.println("phoneBuilder = " + phoneBuilder);

    }
}
