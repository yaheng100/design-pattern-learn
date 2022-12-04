package com.lyh.adapter.objectadapter;

import com.lyh.adapter.classadapter.NetworkSocket;

/**
 * @description: 对象适配器测试
 * @author: yaheng
 * @date: 2022/11/14 18:33
 */
public class ClassAdapterTest {

    public static void main(String[] args) throws Exception {
        Computer computer = new Computer(new NetworkToUsbAdapter(new NetworkSocket()));
        computer.transDataByUSB("hello world");
    }
}
