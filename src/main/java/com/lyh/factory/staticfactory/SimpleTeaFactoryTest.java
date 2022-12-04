package com.lyh.factory.staticfactory;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/11 0:02
 */
public class SimpleTeaFactoryTest {

    //可以通过SimpleTeaFactory类直接调用createTea()
    public static void main(String[] args) throws Exception {
        Tea tea = SimpleTeaFactory.createTea("green");
        tea.showName();

    }

}
