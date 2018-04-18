package com.mjk.spring.ioc03.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

/**
 * SpringBean
 *
 * @author ma-jk
 * @date 2018-04-18 17:09
 **/
@Data
public class SpringBean {
    /**
     * null配型装配
     */
    private String name = "Gavin";
    /**
     * 集合类型的装配
     */
    private Integer[] array;

    private List<OtherBean> list;

    private Set<OtherBean> set;

    private Map<String,OtherBean> map;

    private Properties properties;
}
