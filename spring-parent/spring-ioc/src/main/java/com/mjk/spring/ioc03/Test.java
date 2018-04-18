package com.mjk.spring.ioc03;

import com.mjk.spring.ioc03.entity.SpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ioc03Test
 *
 * @author ma-jk
 * @date 2018-04-18 17:16
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc03/applicationContext.xml");
        SpringBean springBean = (SpringBean) ac.getBean("springBean");
        // 输出集合类型装配结果
        System.out.println(springBean.toString());
    }
}
