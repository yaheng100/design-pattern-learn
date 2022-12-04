package com.lyh.singleton;

/**
 * @description: 单利模式 懒汉式（懒加载）
 * 利用根据JVM类加载时不会加载内部类的性质，由JVM保证单例，来解决懒汉式线程不安全问题
 * @author: yahen
 * @date: 2022/11/9 17:26
 */
public class Singleton07 {

    //定义private修饰的无参构造方法，使之无法被调用者使用new创建实例
    private Singleton07(){};

    //根据JVM类加载机制，加载外部类时不会加载内部类，这样可以实现懒加载
    private static class SingletonHolder{
        private final static  Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton07.getInstance().hashCode())).start();
        }
    }

}
