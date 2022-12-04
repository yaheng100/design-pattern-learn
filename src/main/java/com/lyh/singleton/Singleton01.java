package com.lyh.singleton;

/**
 * @description: 单例模式 饿汉式
 * 该类被JVM加载到内存后就实例化一个单例 由JVM保证线程安全（JVM一个类只加载一次）
 * 简单实用，最基本写法
 * 唯一缺点：不管是否用到，类加载时就完成实例化
 * @author: yahen
 * @date: 2022/11/9 16:35
 */
public class Singleton01 {


    private static final Singleton01 INSTANCE = new Singleton01();

    //定义private修饰的无参构造方法，使之无法被调用者使用new创建实例
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()-> System.out.println(Singleton01.getInstance().hashCode())).start();
        }
    }


}
