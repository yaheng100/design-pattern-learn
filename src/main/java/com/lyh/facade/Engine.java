package com.lyh.facade;

/**
 * @description: 引擎系统
 * 子系统类
 * @author: yaheng
 * @date: 2022/11/20 22:41
 */
public class Engine {

    private final static Engine INSTANCE = new Engine();

    public static Engine getInstance(){
        return INSTANCE;
    }

    public void startUp(){
        System.out.println("引擎启动...");
    }

    public void speedUp(){
        System.out.println("引擎加速...");
    }

    public void speedDown(){
        System.out.println("引擎减速...");
    }

    public void stop(){
        System.out.println("引擎停止...");
    }

}
