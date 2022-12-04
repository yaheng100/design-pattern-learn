package com.lyh.adapter.classadapter;

/**
 * @description: 类适配器 适配器角色（Adapter）
 * 继承被适配类（Adaptee）同时实现 目标角色（Target）接口
 * @author: yaheng
 * @date: 2022/11/14 18:00
 */
public class NetworkToUsbAdapter extends NetworkSocket implements IUSBSocket {

    @Override
    public void transDataByUSB(String data) {
        System.out.println("有数据经过适配器："+data);
        transDataByNetwork(data);
    }
}
