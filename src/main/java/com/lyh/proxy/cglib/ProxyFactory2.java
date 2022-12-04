package com.lyh.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 代理对象工厂  用于生成代理对象
 * @author: yaheng
 * @date: 2022/11/20 0:16
 */
public class ProxyFactory2<T> {


    public T getDynamicProxyInstance(T t) {
        return (T) Enhancer.create(t.getClass(),
            (MethodInterceptor) (o, method, objects, methodProxy) -> {
            before();
            Object result = method.invoke(t, objects);
            after();
            return result;
        });

    }

    private void before() {
        System.out.println("方法执行前通知");
    }

    private void after() {
        System.out.println("方法执行后通知");
    }

}
