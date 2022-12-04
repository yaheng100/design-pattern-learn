package com.lyh.state;

/**
 * @description: 游戏角色防守状态
 * @author: yaheng
 * @date: 2022/11/30 0:23
 */
public class DefensiveState extends GameCharacterState {

    public DefensiveState(GameContext context) {
        super(context);
    }

    @Override
    public void move() {
        System.out.println("防御状态时不能移动！！！");
    }

    @Override
    public void jump() {
        System.out.println("防御状态时不能移动！！！");
    }

    @Override
    public void defend() {
        context.setCurrentState(context.defensiveState);
        System.out.println("防御状态:防御操作继续防御");
    }

    @Override
    public void attack() {
        context.setCurrentState(context.attackState);
        System.out.println("防御状态:攻击操作展开反击");
    }

    @Override
    public void actionEnd() {
        context.setCurrentState(context.staticState);
        System.out.println("防御状态:结束攻击恢复静止");
    }
}
