package com.lyh.memento.whitbox;

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
 * @author: yaheng
 * @date: 2022/12/1 2:08
 */
public class GameCaretaker {


    private Map<String,GameProgressMemento> map = new HashMap<>();


    public void addMemento(String key,GameProgressMemento memento){
        map.put(key,memento);
        System.out.println("存档完成："+key);
    }

    public GameProgressMemento getMemento(String key){
        System.out.println("开始读档："+key);
       return map.get(key);
    }

}
