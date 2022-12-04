package com.lyh.builder;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/14 0:34
 */
public class BuilderTest {
    public static void main(String[] args) {
        BuilderDirector builderDirector = new BuilderDirector(new NewPowerBuilder());
        CarInfo carInfo = builderDirector.buildCar();
        System.out.println(carInfo);

        //链式的创建对象
        CarInfo carInfo1= new CarInfo.Builder()
                .name("混动车")
                .power("燃油+电")
                .engine("燃油发动机+电动机")
                .storage("电池+油箱")
                .build();
        System.out.println(carInfo1);
    }
}
