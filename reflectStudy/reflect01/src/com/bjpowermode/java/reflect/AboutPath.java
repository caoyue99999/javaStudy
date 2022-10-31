package com.bjpowermode.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;

//�о�·���Ļ���
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //���ַ�ʽ��ȱ���ǣ���ֲ�Բ��IDEA����Ĭ�ϵĵ�ǰ·����project��·��
        //�������뿪��IDEA��������������λ�ã���ô��ǰ·���Ͳ���project�ĸ������·������Ч��
        FileReader reader = new FileReader("reflect01/classinfo.properties");

        //ʹ��һ��ͨ�÷�ʽ��ǰ���ǣ��ļ��ĵ�·����������·��֮�£�������src֮�¶�������·��֮�£�src�и�·����
        //���ͣ�Thread.currentThread() ��ʾ��ǰ���̶߳���
        //getContextClassLoader() �ǵ�ǰ�̶߳���ķ��������Ի�ȡ����ǰ�߳���������Ķ���
        //getResource("") ����������ķ�������ǰ�̵߳��������Ĭ�ϴ���ĸ�·���¼�����Դ
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path);
        //�������ַ������Ի�ȡ��ľ���·��

        //ע�⣺·����Ҫ��/
        String pathDb = Thread.currentThread().getContextClassLoader().getResource("com/bjpowermode/java/reflect/db.properties").getPath();
        System.out.println(pathDb);
    }
}
