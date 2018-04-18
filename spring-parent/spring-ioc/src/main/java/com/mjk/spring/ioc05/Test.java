package com.mjk.spring.ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 读取properties配置文件测试类
 *
 * @author Gavin
 * @date 2018-04-18 22:30
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc05/applicationContext.xml");
        System.out.println(ac.getBean("springBean").toString());
    }
}
