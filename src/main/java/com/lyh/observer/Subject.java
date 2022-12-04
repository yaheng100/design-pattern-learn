package com.lyh.observer;

/**
 * @description: 抽象被观察者
 * Subject（抽象被观察者）：抽象主题角色把所有观察者对象的引用保存在一个集合里，并提供可以增加和删除观察者的接口。
 * @author: yaheng
 * @date: 2022/11/28 22:09
 */
public abstract class Subject {

    //增加观察者
    public abstract void attach(Observer observer);

    //移除观察者
    public abstract void detach(Observer observer);

    //通知所有观察者
    public abstract void notify(String message);

}
