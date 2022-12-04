package com.lyh.visitor;

/**
 * @description: 访问者模式测试类
 *
 * 一般容纳在多个不同类、不同接口的容器，如List、Set、Map等，在项目中，一般很少抽象出这个角色。
 * @author: yaheng
 * @date: 2022/11/26 23:20
 */
public class VisitorTest {

    public static void main(String[] args) {
        WebSite baidu = new WebSite("百度");
        WebSite google = new WebSite("谷歌");
        Software wechat = new Software("微信");
        Software aliPay = new Software("支付宝");

        InternetStructure internetStructure = new InternetStructure();
        internetStructure.add(baidu);
        internetStructure.add(google);
        internetStructure.add(wechat);
        internetStructure.add(aliPay);

        Phone phone = new Phone("华为Mate40pro");
        internetStructure.action(phone);

        Computer computer = new Computer("小米笔记本");
        internetStructure.action(computer);

    }

}
