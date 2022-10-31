package com.bjpowermode.java.reflect;

import java.util.ResourceBundle;

/*
java.util包下提供了一个资源帮顶起，以便于获取文件中的内容
用以下方式的时候，属性配置文件xx.properties必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，必须绑定xxx.properties文件，且这个文件也必须在类路径之下，相对路径且不能带.properties后缀
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        //无需使用properties来读取了
        String className = bundle.getString("className");
        System.out.println(className);
    }
}
