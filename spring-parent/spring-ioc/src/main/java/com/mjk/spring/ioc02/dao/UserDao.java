package com.mjk.spring.ioc02.dao;

import com.mjk.spring.ioc02.entity.User;

/**
 * 用户DAO
 *
 * @author ma-jk
 * @create 2018-04-18 10:55
 **/
public interface UserDao {

    User selectByUserName(String userName);
}
