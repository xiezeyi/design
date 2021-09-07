package com.xzy.design.creatation.singleton;

/**
 * 只能有一个
 */
public class Person {
    private String name;
    private String age;

    // 3 提供给外部的实例
    // 4 考虑懒汉 饿汉  懒汉:有用到再实例化
    // 10 volatile 内存可见性，解决指令重排的问题
    private volatile static Person instance;

    // 7 饿汉 很饿 一开始就创建实例，去掉代码块5
    // private final static Person instance = new Person();

    // 1 构造器私有，保证了外部不能实例化
    // 仅能在本类进行实例化
    private Person() {
        
        // 6 测试创建person情况
        System.out.println("创建了Person");
        
    }

    // 2 因为外部不能实例化，故提供一个静态方法供外部访问该实例
    public static Person boss() {

        // 5 先考虑懒汉模式，用的时候再创建 即如果没有实例再去创建
        // 但会涉及到多线程问题，在高并发下可能多个用户同时执行到这一步
        // 解决方法 加锁 方法一：方法上加锁（锁大） 方法二：(双重检查锁+内存可见性)代码块加锁,代码块8，通过两层判断减少了极大的资源损耗
        if (instance == null) {

            // 8 高并发下多用户判断有没有创建实例 没有再创建实例，可能多个用户一起进入下一步(抢锁环节)
            if (instance == null) {
                synchronized (Person.class) {
                    // 8 如果对象已经实例，则其它抢到锁的用户不再创建实例（此时只消耗了锁资源，减少了创建对象的资源）
                    if (instance == null) {

                        // 9 这里还是会有错误，即指令重排问题，赋值操作会被封装成先创建对象再分配地址
                        Person person = new Person();
                        instance = person;

                    }
                }
            }
                // 考虑到高并发下多用户同时判断没有的情况，即这些用户都已经在等待这把锁
            Person person = new Person();
            instance = person;
        }

        return instance;
    }
}
