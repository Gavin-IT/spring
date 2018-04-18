package com.mjk.spring.ioc02.dao.impl;

import com.mjk.spring.ioc02.dao.UserDao;
import com.mjk.spring.ioc02.entity.User;

/**
 *  用户DAO实现类
 *
 * @author ma-jk
 * @date  2018-04-18 11:02
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public User selectByUserName(String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword("123456");
        return user;
    }
}
