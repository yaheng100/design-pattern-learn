package com.lyh.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/19 23:26
 */
public class ProxyFactory1 implements InvocationHandler {

    private IManufacture target;

    public ProxyFactory1(IManufacture target) {
        this.target = target;
    }

    public IManufacture getDynamicProxyInstance(){
        return (IManufacture) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before(){
        System.out.println("方法执行前通知");
    }

    private void after(){
        System.out.println("方法执行后通知");
    }
}
