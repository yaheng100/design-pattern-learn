package com.lyh.singleton;

/**
 * @description: 单利模式 懒汉式（懒加载）
 * 在getInstance()第一次被调用时进行实例化
 * 解决饿汉式的缺点，达到按需初始化的目的，但是却带来线程不安全的问题
 * @author: yahen
 * @date: 2022/11/9 16:54
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03(){}

    public static Singleton03 getInstance() {
        if(INSTANCE == null){
            //多个线程同时判断此处 INSTANCE == null 时出现并发，多个线程都进行了实例化
            try {
                //适当减慢线程执行速度 暴漏多线程不安全问题
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()-> System.out.println(Singleton03.getInstance().hashCode())).start();
        }
    }

}
