package com.lyh.proxy.staticproxy;

/**
 * @description: 手机工厂类  代理手机制造
 * 静态工厂模式中的真实主题角色（Real Subject）/ 被代理类：实现了接口中定义的方法,是代理对象代表的真实对象
 * @author: yaheng
 * @date: 2022/11/19 22:22
 */
public class PhoneManufacturer implements IManufacture {

    @Override
    public void makeSomething() {
        System.out.println("手机制造厂商制造加工手机产品");
    }
}
