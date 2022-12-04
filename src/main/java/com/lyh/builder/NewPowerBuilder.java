package com.lyh.builder;

/**
 * @description: 具体建造者
 * @author: yahen
 * @date: 2022/11/13 23:59
 */
public class NewPowerBuilder extends AbstractPersonBuilder {

    @Override
    public void buildName() {
        carInfo.setName("新能源车");
    }

    @Override
    public void buildPower() {
        carInfo.setPower("电力");
    }

    @Override
    public void buildEngine() {
        carInfo.setEngine("电动机");
    }

    @Override
    public void buildStorage() {
        carInfo.setStorage("电池");
    }
}
