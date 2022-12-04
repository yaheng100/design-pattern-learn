package com.lyh.adapter.classadapter;

/**
 * @description: 类适配器测试
 * 将一个类的接口转换成客户希望的另外一个接口。使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。主要目的是为了解决兼容问题
 * 适配器模式一般包含三种角色：
 * 目标角色（Target）：也就是我们期望的接口；
 * 源角色（Adaptee）：存在于系统中，内容满足客户需求（需转换），但接口不匹配的接口实例；
 * 适配器（Adapter）：将源角色（Adaptee）转化为目标角色（Target）的类实例；
 *
 *
 * @author: yaheng
 * @date: 2022/11/14 18:33
 */
public class ClassAdapterTest {

    public static void main(String[] args) throws Exception {
        Computer computer = new Computer(new NetworkToUsbAdapter());
        computer.transDataByUSB("hello world");
    }
}
