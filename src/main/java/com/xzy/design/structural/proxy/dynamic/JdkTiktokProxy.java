package com.xzy.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTiktokProxy<T> implements InvocationHandler {

    private T target;

    JdkTiktokProxy(T target) {
        this.target = target;
    }

    /**
     * 获取被代理对象的 代理对象
     * @param t
     * @param <T>
     * @return
     */
    public static<T> T getProxy(T t) {
        /**
         * ClassLoader loader, 当前被代理对象的类加载器
         * Class<?>[] interfaces, 当前被代理对象所实现的所有接口
         * InvocationHandler h 当前被代理对象执行目标放大时，使用h可以定义拦截增强的方法
         */
        Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(), //这里必须要获取到接口
                new JdkTiktokProxy(t));
        return (T)t;
    }

    /**
     * 定义目标的方法的拦截逻辑，每个方法都会进该步
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        // 反射执行
        System.out.println("真正执行被代理对象的方法");
        Object invoke = method.invoke(target, args);//真正执行的方法，执行哪个对象的方法，方法参数是什么
        System.out.println("返回值" + invoke);
        return null;
    }
}
