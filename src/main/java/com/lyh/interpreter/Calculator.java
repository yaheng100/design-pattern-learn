package com.lyh.interpreter;

import java.util.Stack;

/**
 * @description: 计算器
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 * @author: yaheng
 * @date: 2022/12/2 21:56
 */
public class Calculator {

    private Stack<AbstractExpression> stack = new Stack<>();

    public int calculate(String expression) {
        char[] chars = expression.toCharArray();
        for (int i = 0; i < expression.length(); i++) {
            switch (chars[i]) {
                case '+':
                    stack.push(new AddExpression(stack.pop(), new VariableExpression(chars[++i])));
                    break;
                case '-':
                    stack.push(new SubExpression(stack.pop(), new VariableExpression(chars[++i])));
                    break;
                default:
                    stack.push(new VariableExpression(chars[i]));
            }
        }
        return stack.pop().interpret();
    }

}
