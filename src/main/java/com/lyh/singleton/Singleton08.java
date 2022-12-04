package com.lyh.singleton;

/**
 * @description: 单列模式 枚举类写法
 * 不仅可以解决线程同步问题，还可以防止反序列化
 * @author: yahen
 * @date: 2022/11/9 17:37
 */
public enum Singleton08 {

    INSTANCE;

    //建议不写get方法，直接Singleton08.INSTANCE调用
    public static Singleton08 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            new Thread(() -> System.out.println(Singleton08.getInstance().hashCode())).start();
            new Thread(() -> System.out.println(Singleton08.INSTANCE.hashCode())).start();
        }
    }
}
