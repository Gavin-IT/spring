package com.mjk.spring.ioc06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化Test
 *
 * @author ma-jk
 * @date 2018-04-19 10:22
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc06/applicationContext.xml");
        // 无参构造方法实例化
        System.out.println(ac.getBean("springBean01"));
        // 有参构造方法实例化
        System.out.println(ac.getBean("springBean02"));
        // 静态Factory进行实例化 无参
        System.out.println(ac.getBean("springBean03"));
        // 静态Factory进行实例化 有参
        System.out.println(ac.getBean("springBean04"));
        // 实例Factory进行实例化 无参
        System.out.println(ac.getBean("springBean05"));
        // 实例Factory进行实例化 有参
        System.out.println(ac.getBean("springBean06"));

    }
}
