package com.lyh.memento.blackbox;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 游戏存档管理器
 * Caretaker（管理者角色）
 *
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * Originator（发起人角色）：负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可以使用备忘录恢复内部状态。Originator可根据需要决定Memento存储Originator的哪些内部状态。
 * Memento（备忘录角色）：负责存储Originator对象的内部状态，并可防止Originator意外的其它对象访问备忘录。
 * Caretaker（管理者角色）：负责保存好备忘录Memento，不能对备忘录的内容进行操作。
 *
 * 优点： 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 2、实现了信息的封装，使得用户不需要关心状态的保存细节。
 * 缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 * 备忘录有两个等效的接口
 *
 * 窄接口：管理者(Caretaker)对象（和其他发起人对象之外的任何对象）看到的是备忘录的窄接口(narror Interface)，这个窄接口只允许他把备忘录对象传给其他的对象。
 * 宽接口：与管理者看到的窄接口相反，发起人对象可以看到一个宽接口(wide Interface)，这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态。
 *
 * 白箱备忘录模式是破话封装性的。因为RoleStateCareTaker能通过Get，Set方法访问RoleStateMemento的变量。
 * 黑箱备忘录模式 备忘录角色对发起人对象提供一个宽接口，而为其他对象提供一个窄接口。在Java语言中，实现双重接口的办法就是将备忘录类设计成发起人类的内部成员类。
 *
 * @author: yaheng
 * @date: 2022/12/1 2:08
 */
public class GameCaretaker {


    private Map<String, Memento> map = new HashMap<>();


    public void addMemento(String key, Memento memento){
        map.put(key,memento);
        System.out.println("存档完成："+key);
    }

    public Memento getMemento(String key){
        System.out.println("开始读档："+key);
       return map.get(key);
    }

}
