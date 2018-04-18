package com.mjk.spring.ioc04.entity;

/**
 * SpringBean
 *
 * @author Gavin
 * @date 2018-04-18 21:18
 **/
public class SpringBean {

    static{
        System.out.println("静态代码块");
    }

    {
        System.out.println("代码块");
    }

    public SpringBean(){
        System.out.println("构造函数");
    }

    private String name;

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    /**
     * 初始化方法 进行初始化操作
     *  会在applicationContext装载完数据之后调用（调用此方法需要在applicationContext文件中指定此方法 在bena标签内添加 init-method="init"属性）
     */
    public void init(){
        // 利用初始化方法改造数据(将name转为大写)
        this.name = this.name.toUpperCase();
        System.out.println("初始化方法");
    }

    /**
     * 销毁方法 在bean被系统回收之前调用，用作数据回收等操作
     */
    public void destroy(){
        System.out.println("销毁方法");
    }
}
