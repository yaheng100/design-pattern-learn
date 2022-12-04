package com.lyh.builder;

/**
 * @description: 指挥者角色
 * @author: yahen
 * @date: 2022/11/14 0:07
 */
public class BuilderDirector {

    private AbstractPersonBuilder builder;

    public BuilderDirector(AbstractPersonBuilder builder) {
        this.builder = builder;
    }

    public CarInfo buildCar(){
        builder.buildName();
        builder.buildPower();
        builder.buildEngine();
        builder.buildStorage();
        return builder.build();
    }


}
