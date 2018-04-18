package com.mjk.spring.ioc02.service.impl;

import com.mjk.spring.ioc02.dao.UserDao;
import com.mjk.spring.ioc02.entity.User;
import com.mjk.spring.ioc02.service.UserService;

import lombok.Setter;

/**
 * UserService实现类
 *
 * @author ma-jk
 * @date 2018-04-18 11:16
 **/
public class UserServiceImpl implements UserService {

    @Setter private UserDao userDao;

    @Override
    public boolean login(String userName, String password) {
        User user = userDao.selectByUserName(userName);
        return user != null && password.equals(user.getPassword());
    }
}
