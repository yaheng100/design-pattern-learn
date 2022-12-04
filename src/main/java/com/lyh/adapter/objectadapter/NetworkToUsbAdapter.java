package com.lyh.adapter.objectadapter;

import com.lyh.adapter.classadapter.NetworkSocket;

/**
 * @description: 对象适配器 适配器角色（Adapter）
 * 对象适配器将适配器（Adapter）对被适配类（Adaptee）的关系由继承改为实现 复合“合成复用原则”
 * 合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。
 * 对象适配器
 * @author: yaheng
 * @date: 2022/11/14 18:00
 */
public class NetworkToUsbAdapter /*extends NetworkSocket*/  implements IUSBSocket {
    //将适配器 对 NetworkSocket 由继承 改为 依赖（持有）
    //也可以直接初始化
    private  NetworkSocket networkSocket;

    public NetworkToUsbAdapter(NetworkSocket networkSocket) {
        this.networkSocket = networkSocket;
    }

    @Override
    public void transDataByUSB(String data) {
        System.out.println("有数据经过适配器：" + data);
        networkSocket.transDataByNetwork(data);
    }
}
