package com.huang.reflection;

public class test07 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.huang.reflection.test07").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        //双亲委派机制
        //java.lang.string-->

        /*D:\work\IDEA2018\jdk1.8.0_291\jre\lib\charsets.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\deploy.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\access-bridge-64.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\cldrdata.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\dnsns.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\jaccess.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\jfxrt.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\localedata.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\nashorn.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\sunec.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\sunjce_provider.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\sunmscapi.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\sunpkcs11.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\ext\zipfs.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\javaws.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\jce.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\jfr.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\jfxswt.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\jsse.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\management-agent.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\plugin.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\resources.jar;
        D:\work\IDEA2018\jdk1.8.0_291\jre\lib\rt.jar;
        D:\work\CodeTest\AnnotationAndReflection\out\production\AnnotationAndReflection;
        D:\work\IDEA2018\IntelliJ IDEA 2018.2.6\lib\idea_rt.jar
         */

    }
}
