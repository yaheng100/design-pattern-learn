package com.lyh.state;

/**
 * @description: 游戏角色状态类 以横版格斗游戏为例 （拳皇97） 实现基本的角色功能
 * State（抽象状态角色）：抽象类或者接口，定义抽象状态。
 *
 * @author: yaheng
 * @date: 2022/11/30 0:06
 */
public abstract class GameCharacterState {

    protected GameContext context;

    public GameCharacterState(GameContext context) {
        this.context = context;
    }

    public abstract void move();

    public abstract void jump();

    public abstract void defend();

    public abstract void attack();

    public abstract void actionEnd();

}
