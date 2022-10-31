package com.bjpowermode.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;

//研究路径的机制
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //这种方式的缺点是：移植性差，在IDEA当中默认的当前路径是project的路径
        //若代码离开了IDEA，换到了其他的位置，那么当前路径就不是project的根，这个路径就无效了
        FileReader reader = new FileReader("reflect01/classinfo.properties");

        //使用一下通用方式的前提是：文件的的路径必须在类路径之下（凡是在src之下都叫在类路径之下，src叫根路径）
        //解释：Thread.currentThread() 表示当前的线程对象
        //getContextClassLoader() 是当前线程对象的方法，可以获取到当前线程类加载器的对象
        //getResource("") 是类加载器的方法，当前线程的类加载器默认从类的根路径下加载资源
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path);
        //采用这种方法可以获取类的绝对路径

        //注意：路径需要带/
        String pathDb = Thread.currentThread().getContextClassLoader().getResource("com/bjpowermode/java/reflect/db.properties").getPath();
        System.out.println(pathDb);
    }
}
