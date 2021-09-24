package com.xzy.design.structural.flyweight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * 足道店 这相当于享元工厂
 *          店里面很多服务员
 *
 * 享元和原型
 * 1.享元返回的是这个本人，这里可能会引起多个人竞争的问题，享元教竞争的时候要进行判断。
 * 2.原型返回的是克隆人
 */
public class ZuDao {
    private static Map<String,AbstractWaitressFlyweight> pool = new HashMap<>();
    // 享元 池子中有对象
    static {
        BeautifulWaitress waitress = new BeautifulWaitress("1111","张1",18);
        BeautifulWaitress waitress2 = new BeautifulWaitress("1121","张2",19);

        pool.put(waitress.id, waitress);
        pool.put(waitress2.id,waitress2);
    }
    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight){
        pool.put(UUID.randomUUID().toString(),waitressFlyweight);

    }

    public  static  AbstractWaitressFlyweight getWaitress(String name){
        AbstractWaitressFlyweight flyweight = pool.get(name);
        if (flyweight == null) {
            for (AbstractWaitressFlyweight value : pool.values()) {
                // 判断当前共享对象能否使用
                if (value.isCanService()) {
                    return value;
                }
            }
            ;
            return null;
        }
        return flyweight;
    }


}
