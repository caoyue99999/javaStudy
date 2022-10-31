package com.bjpowermode.java.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Date;

/*
    Ҫ����һ������ֽ��룬������Ҫ��ȡ�������ֽ��룬һ�������ַ�ʽ��
    ����һ��Class c=Class.forName("����������������");
    ��������Class c=����.getClass();
    ��������Class c=�κ�����.class;
 */


public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        Class.forName()
        1.��̬����
        2.�����Ĳ�����һ���ַ���
        3.�ַ�����Ҫ����һ����ɵ�����
        4.����������������а�����java.lang.Ҳ����ʡ��
         */
        Class c1=null;
        try {
            c1=Class.forName("java.lang.String");//c1����java�ֽ����ļ�String.class��������c1����String����
            Class c2=Class.forName("java.util.Data");
            Class c3=Class.forName("java.lang.Integer");
            Class c4=Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //java���κ�һ������ӵ�еķ���getClass()�����ش� Object ������ʱ�ࡣ���ص�Class������������ʾ���static synchronized���������Ķ���
        String s="abc";
        Class x=s.getClass();//x����String.class�ֽ����ļ���x����String���͡�
        System.out.println(c1==x);//==��������ڴ��е�һ��

         //�����ַ�ʽ��java�������κ�һ�����ͣ����������������ͣ�����.class����
         Class z=String.class;
         Class k= Date.class;
         Class f=int.class;
         Class e=double.class;
    }
}
