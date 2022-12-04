package com.lyh.state;

/**
 * @description: 游戏角色滞空状态
 *
 * 状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 环境(Context)角色，也称上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。
 * 抽象状态(State)角色：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。
 * 具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
 *
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。当然，如果这个状态判断很简单，那就没必要用‘状态模式’了。
 *
 * @author: yaheng
 * @date: 2022/11/30 0:23
 */
public class AloftState extends GameCharacterState {


    public AloftState(GameContext context) {
        super(context);
    }

    @Override
    public void move() {
        context.setCurrentState(context.staticState);
        System.out.println("滞空状态:移动操作控制下落方向");
    }

    @Override
    public void jump() {
        //可以做一个计数器 实现二段跳  每次
        System.out.println("滞空状态时不能跳跃！！！");
    }

    @Override
    public void defend() {
        System.out.println("滞空状态时不能防御！！！");
    }

    @Override
    public void attack() {
        context.setCurrentState(context.attackState);
        System.out.println("滞空状态:攻击操作展开攻击");
    }

    @Override
    public void actionEnd() {
        context.setCurrentState(context.staticState);
        System.out.println("滞空状态:结束滞空落地");
    }
}
