package com.lyh.proxy.jdkproxy;

/**
 * @description: 手机工厂类  代理手机制造
 * JDK动态代理中的被代理类，JDK动态代理 是通过实现被代理类的接口来生成动态代理对象 所以被代理的类必须是一个接口的实现类
 *
 * @author: yaheng
 * @date: 2022/11/19 22:22
 */
public class PhoneManufacturer implements IManufacture {

    @Override
    public void makeSomething() {
        System.out.println("手机制造厂商制造加工手机产品");
    }
}
