package com.lyh.interpreter;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/2 22:05
 */
public class AddExpression extends NonTerminalExpression {

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret()+this.right.interpret();
    }
}
