package com.lyh.decorator;

/**
 * @description: 火属性五行石
 * 具体装饰器（ConcreteDecorator）： Decorator的具体实现类，并给具体组件对象添加额外的功能、责任；
 * 理论上，每个具体装饰器都扩展了具体组件对象的一种功能；
 * @author: yaheng
 * @date: 2022/11/16 19:48
 */
public class FireGem extends InlayGemDecorator{

    public FireGem(AbstractEquip abstractEquip) {
        super(abstractEquip);
        setDescription("五行石·火");
        setAttack(5);
    }
}
