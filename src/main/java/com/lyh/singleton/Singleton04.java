package com.lyh.singleton;

/**
 * @description: 单利模式 懒汉式（懒加载）
 * 使用 synchronized 解决线程不安全问题 但是也带来了效率的下降
 * @author: yahen
 * @date: 2022/11/9 17:06
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04(){};

    //synchronized加锁，使该方法不允许并发
    public synchronized static Singleton04 getInstance() {
        if(INSTANCE == null){
            //多个线程同时判断此处 INSTANCE == null 时出现问题，多个线程都进行了实例化
            try {
                //适当减慢线程执行速度 暴漏多线程不安全问题
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()-> System.out.println(Singleton04.getInstance().hashCode())).start();
        }
    }
}
