package com.lyh.factory.factorymethod;

/**
 * @description: 工厂方法模式
 * 抽象工厂角色
 * 提供了创建产品的接口，调用者通过访问其实现类（具体工厂类）来创建产品
 * 有点
 * @author: yahen
 * @date: 2022/11/11 0:18
 */
public interface TeaFactory {

    Tea createTea();

}
