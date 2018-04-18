package com.mjk.spring.ioc02.action;

import com.mjk.spring.ioc02.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserAction
 *
 * @author ma-jk
 * @date 2018-04-18 11:28
 **/
public class UserAction {

    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc02/applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        boolean flag = userService.login("Gavin","123456");
        System.out.println("flag="+flag);
    }
}
