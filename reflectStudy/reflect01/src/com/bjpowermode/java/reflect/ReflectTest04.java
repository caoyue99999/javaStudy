package com.bjpowermode.java.reflect;

public class ReflectTest04 {
    //�о�Class.forName()����������ʲô
    public static void main(String[] args) {
        try {
            Class.forName("com.bjpowermode.java.reflect.MyClass");
            //��̬�����ִ���ˣ�����ָ��һ����ľ�̬�����ִ���ˣ�����һ�ɲ�ִ�У���ô����ʹ�ã�Class.forName("��������")
            //�����jdbc��������Ҫ
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyClass {
    //��̬������ڼ���ʱִ�У�����ִֻ��һ��
    static {
        System.out.println("MyClass��̬�����ִ����");
    }
}
