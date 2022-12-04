package com.lyh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 网络博主类
 * ConcreteSubject（具体被观察者）：该角色接受具体观察者对象，并在具体主题的内部状态发生改变时，给所有观察者对象发出通知。
 *
 * 观察者模式 （有时被称作发布/订阅模式）：
 * Subject（抽象被观察者）：抽象主题角色把所有观察者对象的引用保存在一个集合里，并提供可以增加和删除观察者的接口。
 * ConcreteSubject（具体被观察者）：该角色接受具体观察者对象，并在具体主题的内部状态发生改变时，给所有观察者对象发出通知。
 * Observer（抽象观察者）:它定义了一个更新接口，在被观察者发出通知的时候可以更新自己。
 * ConcreteObserver（具体观察者）:实现抽象观察者定义的更新接口，当得到主题更改通知时更新自己。
 *
 * 优点：
 * 1.观察者和被观察者都是松耦合（抽象耦合），符合依赖倒置原则。
 * 2.分离了表示层（观察者）和数据逻辑层（被观察者者），并且建立了一套触发机制，使得数据的变化可以响应到多个表示层。
 * 3.实现了一对多的通信机制，支持事件注册机制，支持兴趣分发机制，当被观察者触发时间是，只有订阅的观察者可以接受通知。
 * 缺点
 * 1.如果观察者过多，则事件通知会耗时较长。
 * 2.事件通知为线性，可能出现阻塞。
 * 3.观察者和被观察者可能存在循环依赖，可能造成循环调用，导致系统崩溃。
 *
 *
 * Java中的观察者模式 （JDK9之后已经废弃了  可以使用PropertyChangeEvent和PropertyChangeListener，它是java.beans包下的类）
 * 在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例。
 *  Observable 类是抽象目标类，它有一个 Vector 向量，用于保存所有要通知的观察者对象
 *  Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，
 *  并调用 void update(Observable o,Object arg) 方法，进行相应的工作。
 *
 *
 *
 * @author: yaheng
 * @date: 2022/11/28 22:17
 */
public class InternetBlogger extends Subject {

    private String name;

    private List<Observer> observers = new ArrayList<>();

    public InternetBlogger(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
            System.out.println(observer.getName()+"关注了博主："+name);
        }
    }

    @Override
    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            System.out.println(observer.getName()+"取消关注了博主："+name);
        }
    }

    @Override
    public void notify(String message) {
        System.out.println("博主"+name+message);
        for (Observer observer : observers) {
            observer.update(name+message);
        }
    }
}
