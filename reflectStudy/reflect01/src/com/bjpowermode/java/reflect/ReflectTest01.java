package com.bjpowermode.java.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Date;

/*
    要操作一个类的字节码，首先需要获取这个类的字节码，一共有三种方式：
    方法一：Class c=Class.forName("完整的类名带包名");
    方法二：Class c=对象.getClass();
    方法三：Class c=任何类型.class;
 */


public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        Class.forName()
        1.静态方法
        2.方法的参数是一个字符串
        3.字符串需要的是一个完成的类名
        4.完整的类名必须带有包名。java.lang.也不能省略
         */
        Class c1=null;
        try {
            c1=Class.forName("java.lang.String");//c1代表java字节码文件String.class，或者是c1代表String类型
            Class c2=Class.forName("java.util.Data");
            Class c3=Class.forName("java.lang.Integer");
            Class c4=Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //java中任何一个对象拥有的方法getClass()：返回此 Object 的运行时类。返回的Class对象是由所表示类的static synchronized方法锁定的对象。
        String s="abc";
        Class x=s.getClass();//x代表String.class字节码文件，x代表String类型。
        System.out.println(c1==x);//==代表的是内存中的一样

         //第三种方式：java语言中任何一种类型，包括基本数据类型，都有.class属性
         Class z=String.class;
         Class k= Date.class;
         Class f=int.class;
         Class e=double.class;
    }
}
