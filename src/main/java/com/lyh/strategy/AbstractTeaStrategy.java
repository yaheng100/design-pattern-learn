package com.lyh.strategy;

/**
 * @description: 策略模式中的抽象策略类
 * 抽象策略类除了使用接口也可以使用抽象类，本demo按照设计模式UML图使用接口进行实现
 * @author: yahen
 * @date: 2022/11/9 22:57
 */
public interface AbstractTeaStrategy {

   //抽象方法 所有具体策略类都要实现此方法
   void makeTea();

}
