package com.lyh.builder;

/**
 * @description: 具体建造者
 * @author: yahen
 * @date: 2022/11/13 23:46
 */
public class OilPowerBuilder extends AbstractPersonBuilder {

    @Override
    public void buildName() {
        carInfo.setName("燃油车");
    }

    @Override
    public void buildPower() {
        carInfo.setPower("燃油");
    }

    @Override
    public void buildEngine() {
        carInfo.setEngine("发动机");
    }

    @Override
    public void buildStorage() {
        carInfo.setStorage("油箱");
    }
}
