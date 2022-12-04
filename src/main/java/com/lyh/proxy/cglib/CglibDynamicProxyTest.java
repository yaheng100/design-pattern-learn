package com.lyh.proxy.cglib;




/**
 * @description: cglib通过创建一个继承自被代理类的子类来实现动态代理
 * @author: yaheng
 * @date: 2022/11/20 0:10
 */
public class CglibDynamicProxyTest {

    public static void main(String[] args) {

        //匿名内部类写法
        ProxyFactory proxyFactory = new ProxyFactory(new PhoneManufacturer());
        proxyFactory.getDynamicProxyInstance().makeSomething();


        System.out.println("================");

        //实现 MethodInterceptor 写法
        ProxyFactory1 proxyFactory1 = new ProxyFactory1(new PhoneManufacturer());
        proxyFactory1.getDynamicProxyInstance().makeSomething();

        System.out.println("================");

        //实现 自拓展泛型写法 写法
        ProxyFactory2<PhoneManufacturer> proxyFactory2 = new ProxyFactory2<>();
        proxyFactory2.getDynamicProxyInstance(new PhoneManufacturer()).makeSomething();

    }

}
