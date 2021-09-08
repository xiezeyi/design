package com.xzy.design.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

public class Mybatis {

    // 1 由于每获取到一个数据就新建一个对象，此时进行处理
    // 缓存User
    private Map<String,User> userCache = new HashMap<>();

    /**
     * 模拟从数据库差数据
     * @param username
     * @return
     */
    public User getUser(String username) throws Exception {
        User user = null;
        // 2 如果缓存中没有包含
        if (!userCache.containsKey(username)) {
            // 查询数据库获取user
            user = getUserFromDb(username);
        } else {
            // 3 从缓存中直接拿可能会获取到脏数据
            // 原型已经拿到，但是不能直接给(本人)
            user = userCache.get(username);
            // 5 从这个对象快速得到一个克隆体(克隆人)
            user = (User) user.clone();
        }
        return user;
    }

    private User getUserFromDb(String username) throws Exception{
        System.out.println("从数据查到"+username);
        User user = new User();
        user.setUsername(username);
        user.setAge(18);
        // 6 从缓存中放一个clone，保证第一次存储的时候也是克隆体
        userCache.put(username,(User) user.clone());
        return user;
    }
}
