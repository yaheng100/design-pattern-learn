package com.lyh.command;

/**
 * @description: 灯管开启命令
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * @author: yaheng
 * @date: 2022/11/25 17:06
 */
public class LightOnCommand extends IotCommand{

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.open();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
