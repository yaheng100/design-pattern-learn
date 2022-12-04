package com.lyh.factory.simplefactory;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/11 0:02
 */
public class SimpleTeaFactoryTest {

    public static void main(String[] args) throws Exception {
        SimpleTeaFactory teaFactory = new SimpleTeaFactory();
        Tea tea = teaFactory.createTea("green");
        tea.showName();

    }

}
