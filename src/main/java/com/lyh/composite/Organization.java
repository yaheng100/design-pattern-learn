package com.lyh.composite;

/**
 * @description: 抽象组织机构类
 * 组合模式：
 * 抽象节点类（抽象根节点）：定义系统各层次对象的共有方法和属性，可以预先定义一些默认行为和属性
 * 组合模式分为两种类型：透明组合模式（常用）和安全组合模式
 * 透明组合模式：在抽象节点角色声明定义所有管理子节点成员的方法，叶子节点如果调用这些方法会报错
 * 安全组合模式：为解决透明类型带来的问题，只在抽象类中定义公共方法，在非叶子节点类中单独定义管理成员的方法
 * @author: yaheng
 * @date: 2022/11/17 22:53
 */
public abstract class Organization {

    private String name;

    private Integer level;

    public Organization(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    //可以再此给出默认实现  也可以在子类中给出默认实现
    public void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    //可以再此给出默认实现  也可以在子类中给出默认实现
    public void remove(Organization organization){
        throw new UnsupportedOperationException();
    }


    public abstract void print();


}
