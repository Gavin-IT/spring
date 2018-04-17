package com.mjk.spring.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bena注入测试类
 *
 * @author Gavin
 * @create 2018-04-17 23:21
 **/
public class TestClass {
    public static void main(String[] args) {
        // 获取IOC容器
        // 读取applicationContext文件 初始化上下文 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc01/applicationContext.xml");
        // 通过ID获取容器中的bean对象
        App app = (App) ac.getBean("app");
        app.show();

    }
}
