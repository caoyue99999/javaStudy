package com.bjpowermode.java.reflect;

import com.bjpowermode.java.bean.User;

public class ReflactTest02 {
    public static void main(String[] args) {
        //不使用反射机制创建对象
        User user = new User();
        System.out.println(user);
        try {
            Class c = Class.forName("com.bjpowermode.java.bean.User");

            //newInstance()会调用User这个类的无参数构造方法，完成对象的创建
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        /*
            通过Class的newInstance()来实例化一个对象
            注意：newInstance()内部使用了午餐的构造方法，必须要无参构造
         */

    }
}
