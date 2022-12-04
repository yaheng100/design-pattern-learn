package com.lyh.factory.factorymethod;

/**
 * @description: 具体工厂角色
 * 实现抽象工厂接口，完成具体产品的创建
 * @author: yahen
 * @date: 2022/11/11 0:21
 */
public class RedTeaFactory implements TeaFactory {

    @Override
    public Tea createTea() {
        return new RedTea();
    }
}
