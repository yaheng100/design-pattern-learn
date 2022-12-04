package com.lyh.strategy;

/**
 * @description: 策略模式中的具体策略类
 * @author: yahen
 * @date: 2022/11/9 23:16
 */
public class GreenTeaStrategy implements  AbstractTeaStrategy{

    @Override
    public void makeTea() {
        System.out.println("绿茶使用80-90摄氏度水温冲泡");
    }
}
