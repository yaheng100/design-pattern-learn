package com.lyh.interpreter;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/2 22:12
 */
public class InterpreterTest {

    public static void main(String[] args) {
        String expression = "1+3+8-22+44+18";
        Calculator calculator = new Calculator();
        System.out.println(expression+"="+calculator.calculate(expression));
    }

}
