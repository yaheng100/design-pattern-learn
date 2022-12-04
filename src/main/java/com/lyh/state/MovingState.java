package com.lyh.state;

/**
 * @description: 游戏角色移动状态
 * @author: yaheng
 * @date: 2022/11/30 0:23
 */
public class MovingState extends GameCharacterState {

    public MovingState(GameContext context) {
        super(context);
    }

    @Override
    public void move() {
        context.setCurrentState(context.movingState);
        System.out.println("移动状态:移动操作继续移动");
    }

    @Override
    public void jump() {
        context.setCurrentState(context.aloftState);
        System.out.println("移动状态:跳跃操作后滞空");
    }

    @Override
    public void defend() {
        context.setCurrentState(context.defensiveState);
        System.out.println("移动状态:防御操作开始防御");
    }

    @Override
    public void attack() {
        context.setCurrentState(context.attackState);
        System.out.println("移动状态:攻击操作展开攻击");
    }

    @Override
    public void actionEnd() {
        context.setCurrentState(context.staticState);
        System.out.println("移动状态:停止移动后静止");
    }
}
