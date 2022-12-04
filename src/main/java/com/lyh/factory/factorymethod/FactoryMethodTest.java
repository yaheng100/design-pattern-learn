package com.lyh.factory.factorymethod;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/11 0:23
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        TeaFactory factory = new RedTeaFactory();
        Tea tea = factory.createTea();
        tea.showName();
    }

}
