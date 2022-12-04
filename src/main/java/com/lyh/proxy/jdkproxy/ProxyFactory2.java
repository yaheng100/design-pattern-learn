package com.lyh.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理对象工厂  用于生成代理对象
 * 自拓展的泛型写法  可以拿做工具类使用
 * @author: yaheng
 * @date: 2022/11/19 22:53
 */
public class ProxyFactory2<T>{

    public T getDynamicProxyInstance(Class<T> interfaces,T interfaceInstance){
        if(!interfaces.isInterface()){
            //JDK动态代理中的被代理类，JDK动态代理 是通过实现被代理类的接口来生成动态代理对象 所以被代理的类必须是一个接口的实现类
            throw new RuntimeException("泛型的类型必须为接口interface");
        }
        return (T) Proxy.newProxyInstance(interfaceInstance.getClass().getClassLoader(),
                interfaceInstance.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    before();
                    Object result = method.invoke(interfaceInstance, args);
                    after();
                    return result;
                });
    }

    private void before(){
        System.out.println("方法执行前通知");
    }

    private void after(){
        System.out.println("方法执行后通知");
    }

}
