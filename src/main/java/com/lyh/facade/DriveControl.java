package com.lyh.facade;

/**
 * @description: 驾驶控制系统
 * 子系统类
 * @author: yaheng
 * @date: 2022/11/20 23:10
 */
public class DriveControl {

    private final static DriveControl INSTANCE = new DriveControl();

    public static DriveControl getInstance(){
        return INSTANCE;
    }

    public void on(){
        System.out.println("驾驶控制系统启动...");
    }

    public void throttleIncrease(){
        System.out.println("驾驶控制系统:加油门");
    }

    public void throttleReduce(){
        System.out.println("驾驶控制系统:减油门");
    }

    public void brake(){
        System.out.println("驾驶控制系统:刹车");
    }

    public void steering(){
        System.out.println("驾驶控制系统:转向");
    }

    public void off(){
        System.out.println("驾驶控制系统关闭...");
    }

}
