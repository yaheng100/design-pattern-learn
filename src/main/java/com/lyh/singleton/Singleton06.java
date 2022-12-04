package com.lyh.singleton;

/**
 * @description: 单利模式 懒汉式（懒加载）
 * 使用 synchronized 解决线程不安全问题 但是也带来了效率的下降
 * 与 Singleton04 不同的是：意图减小同步代码块来提升效率，测试后发现不可行
 * 与 Singleton05 不同的是：在同步代码块中再加入一次判断防止再次实例化
 * @author: yahen
 * @date: 2022/11/9 17:06
 */
public class Singleton06 {

    //此处 volatile 关键字是防止JIT(JVM虚拟机语句优化)改变语序
    private static volatile Singleton06 INSTANCE;

    private Singleton06() {
    }

    public static Singleton06 getInstance() {
        if (INSTANCE == null) {
            //多个线程同时判断INSTANCE == null 代码执行到此处
            //假设有a,b两个线程 a先获取到锁执行实例化，同时b等待，
            //a执行结束释放锁之后，b获取到锁继续执行再次进行了实例化
            synchronized (Singleton06.class) {
                if (INSTANCE == null) {
                    //进行双重判断 即可避免再次被实例化
                    try {
                        //适当减慢线程执行速度 暴漏多线程不安全问题
                        Thread.sleep(1L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton06.getInstance().hashCode())).start();
        }
    }
}
