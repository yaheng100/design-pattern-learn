package com.lyh.adapter.interfaceadapter;

/**
 * @description: 抽象适配器类 其子类具体适配器可以选择实现（重写）哪些接口
 * 避免对象适配器模式和类适配器模式造成的 适配器由很多空方法的情况
 * @author: yaheng
 * @date: 2022/11/14 20:26
 */
public abstract class AbstractAdapter implements IUSBSocket {

    @Override
    public void transDataByUSB(String data) {

    }

    @Override
    public void chargePower() {

    }
}
