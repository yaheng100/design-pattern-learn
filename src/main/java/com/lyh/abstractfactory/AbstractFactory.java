package com.lyh.abstractfactory;

/**
 * @description: 抽象工厂模式
 * 抽象工厂角色  系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：当需要新增产品时，需要修改每个工厂类，工作量较大
 * @author: yahen
 * @date: 2022/11/11 0:40
 */
public interface AbstractFactory {

    Tea createTea();

    Wine crateWine();

}
