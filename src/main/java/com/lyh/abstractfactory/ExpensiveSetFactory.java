package com.lyh.abstractfactory;

/**
 * @description: 具体工厂角色  昂贵产品工厂
 * @author: yahen
 * @date: 2022/11/11 0:52
 */
public class ExpensiveSetFactory implements AbstractFactory {
    @Override
    public Tea createTea() {
        return new RedTea();
    }

    @Override
    public Wine crateWine() {
        return new WhiteWine();
    }
}
