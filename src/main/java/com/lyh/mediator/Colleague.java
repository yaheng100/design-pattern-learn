package com.lyh.mediator;

/**
 * @description: 抽象同事类（Colleague）角色
 * 它定义各个同事类公有的方法，并声明了一些抽象方法来供子类实现，同时它维持了一个对抽象中介者类的引用，其子类可以通过该引用来与中介者通信。
 * @author: yaheng
 * @date: 2022/11/22 1:40
 */
public abstract class Colleague {

    //中介类引用
    protected Mediator mediator;

    protected String name;

    public abstract void sendMessage(String to,String message);

    public abstract void receiveMessage(String from,String message);


    public String getName() {
        return name;
    }

}
