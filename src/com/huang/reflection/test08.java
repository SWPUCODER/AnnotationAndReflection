package com.huang.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c1 = Class.forName("com.huang.reflection.User");

/*
        User user = new User();
        c1.getClass();
*/

        //获得类的名字
        System.out.println(c1.getName());  //获得包名 + 类名
        System.out.println(c1.getSimpleName());  //获得类名

        //获得类的属性
        Field[] fields = c1.getDeclaredFields();  //找到全部属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        Method[] methods = c1.getMethods();  //获得本类及父类全部方法
        for (Method method : methods) {
            System.out.println("正常的"+method);
        }

        Method[] declaredMethods = c1.getDeclaredMethods();  //获得本类全部方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("getDeclaredMethods"+declaredMethod);
        }

    }
}
