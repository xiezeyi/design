package com.xzy.design.creatation.prototype.test;

public class MainTest {
    private static final int COUNT = 10000*1000;
    public static void main(String[] args) throws CloneNotSupportedException {
        long s1 = System.currentTimeMillis();

        for (int i = 0; i < COUNT ; i++) {
            Bean bean = new Bean();
        }
        long s2 = System.currentTimeMillis();

        Bean bean = new Bean();

        for (int i = 0; i < COUNT; i++) {
            Bean beanclone = bean.clone();
        }

        long s3 = System.currentTimeMillis();

        System.out.println("new耗时:" + (s2 - s1));
        System.out.println("clone耗时" + (s3 - s2));

        // 再测试一下如果里面数据量比较大时的效率

        long l1 = System.currentTimeMillis();

        for (int i = 0; i < COUNT ; i++) {
            BeanF beanF = new BeanF();
        }
        long l2 = System.currentTimeMillis();

        BeanF beanF = new BeanF();

        for (int i = 0; i < COUNT; i++) {
            BeanF beanclone = beanF.clone();
        }

        long l3 = System.currentTimeMillis();

        System.out.println("l new耗时:" + (l2 - l1));
        System.out.println("l clone耗时" + (l3 - l2));

        // 再测试一下如果里面构造函数内容数据量比较大时的效率

        long l11 = System.currentTimeMillis();

        for (int i = 0; i < COUNT ; i++) {
            BeanF beanF1 = new BeanF("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1");
        }
        long l21 = System.currentTimeMillis();

        BeanF beanF1 = new BeanF("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1");

        for (int i = 0; i < COUNT; i++) {
            BeanF beanclone1 = beanF1.clone();
        }

        long l31 = System.currentTimeMillis();

        System.out.println("l new耗时:" + (l21 - l11));
        System.out.println("l clone耗时" + (l31 - l21));

    }
}
