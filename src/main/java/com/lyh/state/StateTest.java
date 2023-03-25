package com.lyh.state;

/**
 * @description: 状态模式测试类
 * @author: yaheng
 * @date: 2022/11/30 1:58
 */
public class StateTest {

    public static void main(String[] args) {
        GameContext context = new GameContext();
        //当前状态初始化为静止状态
        context.setCurrentState(context.staticState);

        context.move();
        context.jump();
        context.attack();
        context.actionEnd();
        context.defend();


    }

}
