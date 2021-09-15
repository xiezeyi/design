package main.java.com.xzy.design.creatation.builder;

public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();

        // 建造这个手机
        builder.customMem("16G");
        builder.customDisk("1T");
        builder.customCam("2亿");
        builder.customCpu("晓龙8个8");

        Phone product = builder.getProduct();

        System.out.println(product.toString());
    }
}
