package com.lyh.proxy.staticproxy;

/**
 * @description: 手机品牌类
 * 静态代理模式中的代理角色（Proxy）: 实现了被代理对象的相同的接口，其内部包含被代理对象的实例，可以访问，控制，扩展被代理对象
 * @author: yaheng
 * @date: 2022/11/19 22:24
 */
public class PhoneBrand implements IManufacture {

    //被代理对象实例
    private IManufacture iManufacture = new PhoneManufacturer();


    @Override
    public void makeSomething() {
        System.out.println("代理制造手机开始");
        iManufacture.makeSomething();
        System.out.println("代理制造手机完成");
    }
}
