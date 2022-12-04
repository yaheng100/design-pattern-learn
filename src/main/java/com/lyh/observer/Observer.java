package com.lyh.observer;

/**
 * @description: 抽象观察者
 * Observer（抽象观察者）:它定义了一个更新接口，在被观察者发出通知的时候可以更新自己。
 * @author: yaheng
 * @date: 2022/11/28 22:12
 */
public abstract class Observer {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract void update(String message);



}
