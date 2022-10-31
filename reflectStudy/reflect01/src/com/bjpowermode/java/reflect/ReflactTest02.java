package com.bjpowermode.java.reflect;

import com.bjpowermode.java.bean.User;

public class ReflactTest02 {
    public static void main(String[] args) {
        //��ʹ�÷�����ƴ�������
        User user = new User();
        System.out.println(user);
        try {
            Class c = Class.forName("com.bjpowermode.java.bean.User");

            //newInstance()�����User�������޲������췽������ɶ���Ĵ���
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        /*
            ͨ��Class��newInstance()��ʵ����һ������
            ע�⣺newInstance()�ڲ�ʹ������͵Ĺ��췽��������Ҫ�޲ι���
         */

    }
}
