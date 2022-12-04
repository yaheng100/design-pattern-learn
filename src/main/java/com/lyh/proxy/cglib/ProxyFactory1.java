package com.lyh.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: cglib代理对象工厂  实现MethodInterceptor写法
 * @author: yaheng
 * @date: 2022/11/20 0:13
 */
public class ProxyFactory1 implements MethodInterceptor {

    private PhoneManufacturer target;

    public ProxyFactory1(PhoneManufacturer target) {
        this.target = target;
    }

    public PhoneManufacturer getDynamicProxyInstance(){
        return (PhoneManufacturer) Enhancer.create(PhoneManufacturer.class, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = method.invoke(target, objects);
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
