package com.lyh.abstractfactory;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/11 0:54
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        //便宜组合工厂类
        AbstractFactory factory = new CheapSetFactory();
        Wine wine = factory.crateWine();
        Tea tea = factory.createTea();
        wine.showName();tea.showName();

    }

}
