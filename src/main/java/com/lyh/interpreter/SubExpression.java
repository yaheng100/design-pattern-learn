package com.lyh.interpreter;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/2 22:06
 */
public class SubExpression extends NonTerminalExpression {

    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret()-this.right.interpret();
    }
}
