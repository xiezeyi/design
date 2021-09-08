package com.xzy.design.creatation.prototype;

/**
 * 是用于创建重复的对象，同时又能保证性能
 * 1.Mybatis，操作数据库，从数据库里面查出很多记录（70%记录改变很少）
 * 2,每次查到数据库，查到以后把所有数据都封装一个对象，返回
 *      10000 thread 查一个记录 New User("zhangsan",18) 每次创建一个对象封装并返回
 *      系统里面就会有10000个user，浪费内存
 * 3.解决：缓存  查过的保存。
 *          如果再查相同的记录，拿到原来的原型对象
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Mybatis mybatis = new Mybatis();

        User user = mybatis.getUser("12");
        // 7 使用的都是克隆体 不影响本体，本体给外部提供一个克隆体进行使用
        System.out.println("user = " + user);
        // 此时后面的23 和 34 不会打印666 因为有进行过原型处理
        User user1 = mybatis.getUser("12");
        System.out.println("user1 = " + user1);
        user1.setUsername("666");
        System.out.println("user = " + user1);
        User user2 = mybatis.getUser("12");
        System.out.println("user2 = " + user2);

        System.out.println(user == user2);
    }
}
