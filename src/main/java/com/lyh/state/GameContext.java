package com.lyh.state;

/**
 * @description: 游戏角色状态环境类
 * @author: yaheng
 * @date: 2022/11/30 0:32
 */
public class GameContext {


    GameCharacterState staticState = new StaticState(this);
    GameCharacterState movingState = new MovingState(this);
    GameCharacterState aloftState = new AloftState(this);
    GameCharacterState attackState = new AttackState(this);
    GameCharacterState defensiveState = new DefensiveState(this);

    GameCharacterState currentState;

    public GameCharacterState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameCharacterState currentState) {
        System.out.println();
        this.currentState = currentState;
    }


    public void move() {
        this.currentState.move();
    }

    public void jump() {
        this.currentState.jump();
    }

    public void defend() {
        this.currentState.defend();
    }

    public void attack() {
        this.currentState.attack();
    }

    public void actionEnd() {
        this.currentState.actionEnd();
    }
}
