package com.lyh.state;

/**
 * @description: 状态模式测试类
 * @author: yaheng
 * @date: 2022/11/30 1:58
 */
public class StateTest {

    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.setCurrentState(context.staticState);

        context.move();
        context.jump();
        context.attack();
        context.actionEnd();
        context.defend();


    }

}
