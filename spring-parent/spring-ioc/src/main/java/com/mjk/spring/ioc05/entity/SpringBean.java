package com.mjk.spring.ioc05.entity;

import lombok.Data;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SrpingBean
 *
 * @author Gavin
 * @date 2018-04-18 22:18
 **/
@Data
public class SpringBean {

    private static Pattern CHAR_PATTERN = Pattern.compile("\\$\\{(.*)\\}");

    private String name;

    private String email;

    /**
     * bean初始化方法
     */
    public void init(){
        this.name = reValue(this.name);
        this.email = reValue(this.email);
    }

    /**
     * 读取配置文件 获取value
     * @param value 容器装载的value
     * @return value
     */
    private String reValue(String value) {

        if(value ==null || "".equals(value)){
            return value;
        }
        // 方式1：字符串截取
//        if(value.startsWith("${")&&value.endsWith("}")){
//            String key = value.substring(2,value.length()-1);
//            return getProperty(key);
//        }
        // 方式2：正则表达式
        Matcher matcher = CHAR_PATTERN.matcher(value);
        // 判断是否匹配
        if(matcher.matches()) {
            return getProperty(matcher.group(1));
        }
        return value;
    }

    /**
     *  根据key到 propertites文件中获取value
     * @param key 文件中的key
     * @return value
     */
    private String getProperty(String key) {
        Properties p = new Properties();
        try {
            p.load(SpringBean.class.getClassLoader().getResourceAsStream("ioc05/info.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!p.containsKey(key)){
            throw new RuntimeException("could not found key: "+key+" in properties");
        }
        return p.getProperty(key);
    }
}
