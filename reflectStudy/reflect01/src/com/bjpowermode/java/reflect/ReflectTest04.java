package com.bjpowermode.java.reflect;

public class ReflectTest04 {
    //研究Class.forName()究竟发生了什么
    public static void main(String[] args) {
        try {
            Class.forName("com.bjpowermode.java.reflect.MyClass");
            //静态代码块执行了，若是指向一个类的静态代码块执行了，其他一律不执行，那么可以使用：Class.forName("完整类名")
            //后面的jdbc技术还需要
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyClass {
    //静态代码块在加载时执行，并且只执行一次
    static {
        System.out.println("MyClass静态代码块执行了");
    }
}
