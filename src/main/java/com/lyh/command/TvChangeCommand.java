package com.lyh.command;

/**
 * @description: 电视换台命令
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * @author: yaheng
 * @date: 2022/11/25 17:06
 */
public class TvChangeCommand extends IotCommand{

    private TvReceiver tvReceiver;

    public TvChangeCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.change();
    }

    @Override
    public void undo() {
        System.out.println("智能电视更换频道");
        tvReceiver.change();
    }
}
