package com.lyh.interpreter;

/**
 * @description:
 * TerminalExpression（终结表达式）：实现文法中与终结符有关的解释操作。
 * @author: yaheng
 * @date: 2022/12/2 20:36
 */
public abstract class NonTerminalExpression extends AbstractExpression {

    protected AbstractExpression left;

    protected AbstractExpression right;

    public NonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract int interpret();
}
