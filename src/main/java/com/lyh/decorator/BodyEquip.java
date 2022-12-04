package com.lyh.decorator;

/**
 * @description: 上身装备
 * 具体组件（ConcreteComponent）:实现/继承Component的一个具体对象，也即被装饰对象；
 * @author: yaheng
 * @date: 2022/11/16 19:25
 */
public class BodyEquip extends AbstractEquip {

    public BodyEquip() {
        setDescription("神龙上衣");
        setAttack(50);
    }

    @Override
    public Integer calculateAttack() {
        return super.getAttack();
    }
}
