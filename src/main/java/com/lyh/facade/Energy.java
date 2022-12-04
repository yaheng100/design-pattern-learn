package com.lyh.facade;

/**
 * @description: 能源模块
 * 子系统类
 * @author: yaheng
 * @date: 2022/11/20 23:05
 */
public class Energy {


    private final static Energy INSTANCE = new Energy();

    public static Energy getInstance(){
        return INSTANCE;
    }

    public void on(){
        System.out.println("能源模块启动...");
    }

    public void out(){
        System.out.println("能源模块输出能源...");
    }

    public void off(){
        System.out.println("能源模块关闭...");
    }

}
