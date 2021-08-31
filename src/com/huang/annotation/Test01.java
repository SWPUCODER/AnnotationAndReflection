package com.huang.annotation;

import java.util.ArrayList;
import java.util.List;

/*什么是注解*/
public class Test01 extends Object{

    @Override   //重写注解
    public String toString(){
        return super.toString();
    }

    @Deprecated  //不推荐使用
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }

}
