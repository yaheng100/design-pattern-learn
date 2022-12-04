package com.lyh.decorator;

/**
 * @description: 镶嵌宝石类
 * 抽象装饰器（Decorator）:继承并实现抽象组件，并包含一个具体组件实例
 *
 * @author: yaheng
 * @date: 2022/11/16 19:44
 */
public abstract class InlayGemDecorator extends AbstractEquip {

    private AbstractEquip abstractEquip;

    public InlayGemDecorator(AbstractEquip abstractEquip) {
        this.abstractEquip = abstractEquip;
    }

    public String getDescription(){
        return abstractEquip.getDescription()+" 镶嵌:"+ super.getDescription();
    }

    public  Integer calculateAttack(){
        return abstractEquip.calculateAttack() + super.getAttack();
    }
}
