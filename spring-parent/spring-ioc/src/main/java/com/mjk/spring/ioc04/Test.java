package com.mjk.spring.ioc04;

import com.mjk.spring.ioc04.entity.SpringBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期测试类
 *
 * @author Gavin
 * @date 2018-04-18 21:18
 **/
public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ioc04/applicationContext.xml");
        SpringBean bean = (SpringBean) ac.getBean("springBean");
        System.out.println(bean.getName());
        // 模拟容器被销毁
        ac.destroy();// 立即销毁 强关
//        ac.registerShutdownHook(); // 等代码执行结束友好销毁

        // 由以上输出可见 再没有调用ac.getBean的时候Spring已经将bean进行加载了
        // 输出结果为 静态代码块 - 代码块 - 构造函数 - setName - 初始化方法 - getName - GAVIN - 销毁方法
        // 由此可见bean的生命周期为 代码块 - 实例化 - 数据装配 - 初始化方法 - 就绪（未调用阶段）- 调用 - 销毁方法 - 容器销毁
    }
}
