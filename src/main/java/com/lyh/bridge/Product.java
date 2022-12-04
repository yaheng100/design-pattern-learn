package com.lyh.bridge;

/**
 * @description: 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * @author: yaheng
 * @date: 2022/11/14 22:06
 */
public abstract class Product {

    protected Company company;

    public Product(Company company) {
        this.company = company;
    }

    public abstract void showProductInfo();

}
