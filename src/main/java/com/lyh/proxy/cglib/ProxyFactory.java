package com.lyh.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 代理对象工厂  用于生成代理对象 MethodInterceptor匿名内部类写法
 * @author: yaheng
 * @date: 2022/11/19 23:58
 */
public class ProxyFactory {

    private PhoneManufacturer target;

    public ProxyFactory(PhoneManufacturer target) {
        this.target = target;
    }

    public PhoneManufacturer getDynamicProxyInstance(){
       return (PhoneManufacturer) Enhancer.create(PhoneManufacturer.class,
           (MethodInterceptor) (o, method, objects, methodProxy) -> {
           before();
           Object result = method.invoke(target, objects);
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
