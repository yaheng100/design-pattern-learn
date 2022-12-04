package com.lyh.abstractfactory;

/**
 * @description: 具体工厂角色  便宜产品工厂
 * @author: yahen
 * @date: 2022/11/11 0:51
 */
public class CheapSetFactory implements AbstractFactory {
    @Override
    public Tea createTea() {
        return new GreenTea();
    }

    @Override
    public Wine crateWine() {
        return new YellowWine();
    }
}
