package com.lyh.interpreter;

/**
 * @description: 数值表达式
 * TerminalExpression（终结表达式）：实现文法中与终结符有关的解释操作。
 * @author: yaheng
 * @date: 2022/12/2 20:36
 */
public abstract class TerminalExpression extends AbstractExpression {

    protected int value;

    public abstract int interpret();
}
