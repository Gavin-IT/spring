package com.mjk.spring.ioc06;

/**
 * SpringBeanFactory
 *
 * @author ma-jk
 * @date 2018-04-19 10:30
 **/
public class SpringBeanFactory {

    public static SpringBean getSpringBean(){
        return new SpringBean();
    }

    public static SpringBean getSpringBean(String name,int age){
        return new SpringBean(name,age);
    }

    public SpringBean getSpringBeanByInstance(){
        return new SpringBean();
    }

    public SpringBean getSpringBeanByInstance(String name,int age){
        return new SpringBean(name,age);
    }
}
