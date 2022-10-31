package com.bjpowermode.java.reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws IOException {
        //ͨ��IO����ȡclassinfo.properties�ļ�
        FileReader reader = new FileReader("reflect01/classinfo.properties");
        //���������Զ���Map
        Properties pro = new Properties();
        //����
        pro.load(reader);
        reader.close();

        //ͨ��key��ȡvalue
        String className = pro.getProperty("className");
        System.out.println(className);

        //ͨ���������ʵ��������
        Class c = null;
        try {
            c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        //�������ļ���Ϊ���ڶ�����ôObject�о������ڶ���
        //������Ƶ����������Java����ֻдһ�飬�ڲ��ı�java���������£��ܹ�������ͬ�����ʵ�������ǳ����
        //����OCPԭ�򣺶���չ���ţ����޸Ĺر�
        //���ں���ʹ�õĸ߼���ܣ�����ssh ssm Spring SpringMVC Struts Mybatis
        //������������ܵײ��Դ����

        //���Ƚ���д������������ʽ���أ���
        InputStream reader2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        pro.load(reader2);
        reader2.close();;
        String className2= pro.getProperty("className");
        System.out.println(className2);

    }
}
