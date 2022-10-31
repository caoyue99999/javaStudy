package com.bjpowermode.java.reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws IOException {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("reflect01/classinfo.properties");
        //创建类属性对象Map
        Properties pro = new Properties();
        //加载
        pro.load(reader);
        reader.close();

        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);

        //通过反射机制实例化对象
        Class c = null;
        try {
            c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        //若配置文件中为日期对象，那么Object中就是日期对象
        //反射机制的灵活性在于Java代码只写一遍，在不改变java代码的情况下，能够做到不同对象的实例化，非常灵活
        //符合OCP原则：对扩展开放，对修改关闭
        //对于后期使用的高级框架，包括ssh ssm Spring SpringMVC Struts Mybatis
        //有利于剖析框架底层的源代码

        //更先进的写法（以流的形式返回）：
        InputStream reader2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        pro.load(reader2);
        reader2.close();;
        String className2= pro.getProperty("className");
        System.out.println(className2);

    }
}
