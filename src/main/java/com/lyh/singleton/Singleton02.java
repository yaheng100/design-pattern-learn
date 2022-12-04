package com.lyh.singleton;

/**
 * @description: 单例模式 饿汉式
 * 饿汉式另一种写法 与Singleton01没有本质区别
 * @author: yahen
 * @date: 2022/11/9 16:49
 */
public class Singleton02 {
    private static final Singleton02 INSTANCE;

    //使用静态代码块初始化该实例
    static {
        INSTANCE = new Singleton02();
    }

    //定义private修饰的无参构造方法，使之无法被调用者使用new创建实例
    private Singleton02(){};

    public static Singleton02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()-> System.out.println(Singleton02.getInstance().hashCode())).start();
        }
    }
}
