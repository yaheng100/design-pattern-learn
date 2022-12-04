package com.lyh.adapter.interfaceadapter;



/**
 * @description: 接口适配器测试
 * @author: yaheng
 * @date: 2022/11/14 18:33
 */
public class ClassAdapterTest {

    public static void main(String[] args) throws Exception {
        Computer computer = new Computer(new NetworkToUsbTransDataAdapter(new NetworkSocket()));
        computer.transDataByUSB("hello world");

        //另一种用法 使用匿名内部类实现指定方法
        Computer computer1  = new Computer(new AbstractAdapter() {
            private NetworkSocket networkSocket = new NetworkSocket();
            @Override
            public void transDataByUSB(String data) {
                networkSocket.transDataByNetwork(data);
            }
        });
        computer1.transDataByUSB("111");

    }
}
