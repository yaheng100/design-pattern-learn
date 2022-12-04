package com.lyh.builder;

/**
 * @description: 产品类 汽车
 * @author: yahen
 * @date: 2022/11/13 23:39
 */
public class CarInfo {

    private String name;

    private String power;

    private String engine;

    private String storage;

    public CarInfo() {

    }

    public CarInfo(Builder builder) {
        this.name = builder.name;
        this.power = builder.power;
        this.engine = builder.engine;
        this.storage = builder.storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", engine='" + engine + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    //声明Builder可以链式的创建对象
    public static class Builder{
        private String name;

        private String power;

        private String engine;

        private String storage;


        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder power(String power){
            this.power = power;
            return this;
        }
        public Builder engine(String engine){
            this.engine = engine;
            return this;
        }
        public Builder storage(String storage){
            this.storage = storage;
            return this;
        }
        public CarInfo build(){
            return new CarInfo(this);
        }
    }

}
