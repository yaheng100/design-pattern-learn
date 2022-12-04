package com.lyh.state;

/**
 * @description: 游戏角色静止状态
 * @author: yaheng
 * @date: 2022/11/30 0:23
 */
public class StaticState extends GameCharacterState {

    public StaticState(GameContext context) {
        super(context);
    }

    @Override
    public void move() {
        context.setCurrentState(context.movingState);
        System.out.println("静止状态:移动操作开始移动");
    }

    @Override
    public void jump() {
        context.setCurrentState(context.aloftState);
        System.out.println("静止状态:跳跃操作开始滞空");
    }

    @Override
    public void defend() {
        context.setCurrentState(context.movingState);
        System.out.println("静止状态:防御操作开始防御");
    }

    @Override
    public void attack() {
        context.setCurrentState(context.attackState);
        System.out.println("静止状态:攻击操作展开攻击");
    }

    @Override
    public void actionEnd() {
        System.out.println("静止状态不需要停止");
    }
}
