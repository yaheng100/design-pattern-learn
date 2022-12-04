package com.lyh.mediator;

/**
 * @description: 美国聊天用户
 * 具体同事类
 * @author: yaheng
 * @date: 2022/11/22 2:12
 */
public class USAUser extends Colleague{

    public USAUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public void sendMessage(String to, String message) {
        System.out.print("USA用户：");
        System.out.println(name+"向"+ to+"发送消息："+message);
        mediator.sendMessage(this,to,message);
    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.print("USA用户：");
        System.out.println(name+" 接收到来自 "+ from +"的消息："+message);
    }
}
