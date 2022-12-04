package com.lyh.proxy.staticproxy;

/**
 * @description: 静态代理模式测试类
 * @author: yaheng
 * @date: 2022/11/19 22:32
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //创建手机厂商
        PhoneBrand phoneBrand = new PhoneBrand();
        //使用手机厂商制造手机
        phoneBrand.makeSomething();
    }

}
