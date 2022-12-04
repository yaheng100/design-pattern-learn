package com.lyh.command;

/**
 * @description: 电视机命令接受者
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * @author: yaheng
 * @date: 2022/11/25 16:54
 */
public class TvReceiver {


    public void open(){
        System.out.println("智能电视已开启");
    }

    public void off(){
        System.out.println("智能电视已关闭");
    }

    public void change(){
        System.out.println("智能电视更换频道");
    }


}
