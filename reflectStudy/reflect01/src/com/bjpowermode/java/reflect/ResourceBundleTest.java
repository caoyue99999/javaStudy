package com.bjpowermode.java.reflect;

import java.util.ResourceBundle;

/*
java.util�����ṩ��һ����Դ�ﶥ���Ա��ڻ�ȡ�ļ��е�����
�����·�ʽ��ʱ�����������ļ�xx.properties���������·����
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //��Դ�����������xxx.properties�ļ���������ļ�Ҳ��������·��֮�£����·���Ҳ��ܴ�.properties��׺
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        //����ʹ��properties����ȡ��
        String className = bundle.getString("className");
        System.out.println(className);
    }
}
