package com.mjk.spring.ioc01;

/**
 * Hello world!
 *
 */
public class App 
{
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.print("Hello World "+userName);
    }
}
