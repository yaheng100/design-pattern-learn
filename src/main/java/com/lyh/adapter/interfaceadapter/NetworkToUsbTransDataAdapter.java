package com.lyh.adapter.interfaceadapter;


/**
 * @description: 接口适配器 通过接口适配模式 可以选择性的实现指定的接口 避免适配器包含许多空方法
 * @author: yaheng
 * @date: 2022/11/14 18:00
 */
public class NetworkToUsbTransDataAdapter extends AbstractAdapter {
    //将适配器 对 NetworkSocket 由继承 改为 依赖（持有）
    //也可以直接初始化
    private  NetworkSocket networkSocket;

    public NetworkToUsbTransDataAdapter(NetworkSocket networkSocket) {
        this.networkSocket = networkSocket;
    }

    @Override
    public void transDataByUSB(String data) {
        System.out.println("有数据经过适配器：" + data);
        networkSocket.transDataByNetwork(data);
    }
}
