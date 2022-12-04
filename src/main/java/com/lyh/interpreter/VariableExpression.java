package com.lyh.interpreter;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/2 21:51
 */
public class VariableExpression extends TerminalExpression {

    public VariableExpression(char num) {
        this.value = (int) num;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
