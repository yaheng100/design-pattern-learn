package com.lyh.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理对象工厂
 * 使用JDK反射中自带的API Proxy.newProxyInstance()方法动态的获取代理对象
 * 匿名内部类实现 InvocationHandler 写法
 * @author: yaheng
 * @date: 2022/11/19 23:19
 */
public class ProxyFactory {

    private IManufacture target;

    public ProxyFactory(IManufacture target) {
        this.target = target;
    }

    public IManufacture getDynamicProxyInstance(){
       IManufacture iManufacture = (IManufacture) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        before();
                        Object result = method.invoke(target, args);
                        after();
                        return result;
                    }
                });
        return iManufacture;
    }

    private void before(){
        System.out.println("方法执行前通知");
    }

    private void after(){
        System.out.println("方法执行后通知");
    }

}
