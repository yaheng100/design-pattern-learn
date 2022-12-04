package com.lyh.facade;

/**
 * @description: 自动档离合器
 * 子系统类
 * @author: yaheng
 * @date: 2022/11/20 23:19
 */
public class AutoClutch {

    private final static AutoClutch INSTANCE = new AutoClutch();

    public static AutoClutch getInstance(){
        return INSTANCE;
    }

    public void on(){
        System.out.println("离合器启动...");
    }

    public void inGear(){
        System.out.println("离合器挂挡...");
    }

    public void changeGear(){
        System.out.println("离合器换挡...");
    }

    public void off(){
        System.out.println("离合器关闭...");
    }

}
