package com.lyh.state;

/**
 * @description: 游戏角色静止状态
 * @author: yaheng
 * @date: 2022/11/30 0:23
 */
public class AttackState extends GameCharacterState {

    public AttackState(GameContext context) {
        super(context);
    }

    @Override
    public void move() {
        System.out.println("攻击状态时不能移动！！！");
    }

    @Override
    public void jump() {
        System.out.println("攻击状态时不能跳跃！！！");
    }

    @Override
    public void defend() {
        System.out.println("攻击状态时不能防御！！！");
    }

    @Override
    public void attack() {
        context.setCurrentState(context.attackState);
        System.out.println("攻击状态:攻击操作继续攻击");
    }

    @Override
    public void actionEnd() {
        context.setCurrentState(context.staticState);
        System.out.println("攻击状态:结束攻击恢复静止");
    }
}
