package com.mjk.spring.ioc02.action;

import com.mjk.spring.ioc02.service.UserService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
        // 以下获取IOC容器方式通过文件进行加载 不常用
//        ApplicationContext ac = new FileSystemXmlApplicationContext("当前计算机系统文件路径 d:/...");
        UserService userService = (UserService) ac.getBean("userService");
        boolean flag = userService.login("Gavin","123456");
        System.out.println("flag="+flag);

        // 如果不用ApplicationContext获取bean对象 也可以使用BeanFactory获取 此方法以过时
        Resource res = new ClassPathResource("ioc02/applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        UserService userService2 = (UserService)bf.getBean("userService");
    }
}
