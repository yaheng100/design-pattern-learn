package com.lyh.command;

/**
 * @description:
 * 命令模式：
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分隔开。
 * 这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 *
 * 优点：
 *
 * 降低系统的耦合度
 * 新的命令可以很容易地加入到系统中，符合开闭原则
 * 可以比较容易地设计一个命令队列或宏命令（组合命令）
 * 为请求的撤销(Undo)和恢复(Redo)操作提供了一种设计和实现方案
 *
 * 缺点：
 * 使用命令模式可能会导致某些系统有过多的具体命令类（针对每 一个对请求接收者的调用操作都需要设计一个具体命令类）

 * 命令模式包含以下主要角色：
 * 抽象命令类（Command）角色： 定义命令的接口，声明执行的方法。
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 * 调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 *
 * @author: yaheng
 * @date: 2022/11/25 17:40
 */
public class CommandTest {

    public static void main(String[] args) {
        //单个命令测试
        TvReceiver tvReceiver = new TvReceiver();
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);

        IotControl iotControl = new IotControl(tvOnCommand);
        //电视开机命令测试
        iotControl.execute();
        iotControl.undo();

        System.out.println("===========");
        iotControl.setIotCommand(tvOffCommand);
        //电视关机命令测试
        iotControl.execute();
        iotControl.undo();

        System.out.println("===========");
        //综合遥控器测试
        LightReceiver lightReceiver = new LightReceiver();
        TvChangeCommand tvChangeCommand = new TvChangeCommand(tvReceiver);
        IotCompositeControl compositeControl = IotCompositeControl.getInstance();

        //按钮1为开启电视 2为关闭电视 3为换台
        compositeControl.setCommand(1,tvOnCommand);
        compositeControl.setCommand(2,tvOffCommand);
        compositeControl.setCommand(3,tvChangeCommand);


        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        compositeControl.setCommand(4,lightOnCommand);
        compositeControl.setCommand(5,lightOffCommand);

        //测试综合遥控器
        compositeControl.execute(4);
        compositeControl.undo();
        compositeControl.execute(1);

        compositeControl.execute(3);
        compositeControl.redo();
        compositeControl.redo();
        compositeControl.redo();



    }

}
