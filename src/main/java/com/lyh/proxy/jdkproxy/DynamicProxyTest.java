package com.lyh.proxy.jdkproxy;

/**
 * @description: 动态代理测试类
 * @author: yaheng
 * @date: 2022/11/19 23:14
 */
public class DynamicProxyTest {
    public static void main(String[] args) {

        //匿名内部类写法
        ProxyFactory proxyFactory = new ProxyFactory(new PhoneManufacturer());
        proxyFactory.getDynamicProxyInstance().makeSomething();

        System.out.println("================");

        //实现 InvocationHandler 写法
        ProxyFactory1 proxyFactory1 = new ProxyFactory1(new PhoneManufacturer());
        proxyFactory1.getDynamicProxyInstance().makeSomething();

        System.out.println("================");

        //实现 自拓展泛型写法 写法
        ProxyFactory2<IManufacture> proxyFactory2 = new ProxyFactory2<>();
        proxyFactory2.getDynamicProxyInstance(IManufacture.class,new PhoneManufacturer()).makeSomething();




    }
}
