package com.lyh.command;

/**
 * @description: 电视开机命令
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * @author: yaheng
 * @date: 2022/11/25 17:06
 */
public class TvOnCommand extends IotCommand{

    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.open();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
