package com.lyh.command;

/**
 * @description: 物联网抽象命令类
 * 命令（Command）角色：声明了一个给所有具体命令类的抽象接口。这是一个抽象角色
 * @author: yaheng
 * @date: 2022/11/25 16:30
 */
public abstract class IotCommand {

    public abstract void execute();

    public abstract void undo();

}
