package com.lyh.strategy;

/**
 * @description: 策略模式中的具体策略类
 * @author: yahen
 * @date: 2022/11/9 23:19
 */
public class RedTeaStrategy implements AbstractTeaStrategy {
    @Override
    public void makeTea() {
        System.out.println("绿茶使用90摄氏度以上水温冲泡");
    }
}
