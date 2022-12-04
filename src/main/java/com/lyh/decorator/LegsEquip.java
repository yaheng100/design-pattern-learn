package com.lyh.decorator;

/**
 * @description: 下身装备
 * 具体组件（ConcreteComponent）:实现/继承Component的一个具体对象，也即被装饰对象；
 * @author: yaheng
 * @date: 2022/11/16 19:25
 */
public class LegsEquip extends AbstractEquip {

    public LegsEquip() {
        setDescription("神龙下装");
        setAttack(20);
    }

    @Override
    public Integer calculateAttack() {
        return super.getAttack();
    }

}
