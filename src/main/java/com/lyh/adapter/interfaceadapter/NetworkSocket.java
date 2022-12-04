package com.lyh.adapter.interfaceadapter;

/**
 * @description: 源角色（Adaptee）也称被适配的类
 * 适配器模式 本demo以笔记本电脑拓展坞为例 将网线、SD卡、HDMI接口通过适配器转化为Type-c接口
 * @author: yaheng
 * @date: 2022/11/14 17:38
 */
public class NetworkSocket {

    public void transDataByNetwork(String data){
        System.out.println("网络插口传输数据："+data);
    }



}
