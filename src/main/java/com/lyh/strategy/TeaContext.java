package com.lyh.strategy;

/**
 * @description: 策略模式环境类
 * @author: yahen
 * @date: 2022/11/9 23:23
 */
public class TeaContext {
    private AbstractTeaStrategy strategy;

    public TeaContext(AbstractTeaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AbstractTeaStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.makeTea();
    }
}
