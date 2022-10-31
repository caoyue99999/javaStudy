# java反射

## 1. 反射机制简介

### 反射作用

通过java语言中的反射机制可以操作字节码文件。
优点类似于黑客。（可以读和修改字节码文件。）
通过反射机制可以操作代码片段。（class文件。）

### 反射的包

```java
java.lang.reflect.*;
```

### 反射机制作用的类

	java.lang.Class：代表整个字节码，代表一个类型，代表整个类。
	java.lang.reflect.Method：代表字节码中的方法字节码。代表类中的方法。
	java.lang.reflect.Constructor：代表字节码中的构造方法字节码。代表类中的构造方法
	java.lang.reflect.Field：代表字节码中的属性字节码。代表类中的成员变量（静态变量+实例变量）。
	java.lang.Class：

```java

public class User{
    // Field
    int no;

    // Constructor
    public User(){

    }
    public User(int no){
        this.no = no;
    }

    // Method
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
}
```



## 2. 关于JDK中自带的类加载器：（不需要掌握，知道当然最好！）
### 什么是类加载器？

专门负责加载类的命令/工具。ClassLoader
	

### JDK中自带了3个类加载器

启动类加载器:rt.jar
扩展类加载器:ext/*.jar
应用类加载器:classpath



### 假设有这样一段代码：
​		String s = "abc";

代码在开始执行之前，会将所需要类全部加载到JVM当中。通过类加载器加载，看到以上代码类加载器会找*String.class*文件，找到就加载，那么是怎么进行加载的呢？



首先通过`“启动类加载器”`加载。注意：启动类加载器专门加载：C:\Program Files\Java\jdk1.8.0_101\jre\lib\rt.jarrt.jar中都是JDK最核心的类库。


如果通过“启动类加载器”加载不到的时候，会通过"扩展类加载器"加载。
注意：扩展类加载器专门加载：C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\*.jar




如果“扩展类加载器”没有加载到，那么会通过“应用类加载器”加载。

注意：应用类加载器专门加载：classpath中的类。



### java中为了保证类加载的安全，使用了双亲委派机制。

优先从`启动类加载器`中加载，这个称为“父”，“父”无法加载到，再从`扩展类加载器`中加载，这个称为“母”。双亲委派。如果都加载不到，才会考虑从`应用类加载器`中加载。直到加载到为止。



什么是类加载器？
		专门负责加载类的命令/工具。
		ClassLoader



JDK中自带了3个类加载器
		启动类加载器：rt.jar
		扩展类加载器：ext/*.jar
		应用类加载器：classpath



