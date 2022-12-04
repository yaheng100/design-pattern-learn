package com.lyh.decorator;

/**
 * @description: 抽象装备类
 * 抽象组件（Component）:可以是一个接口或者抽象类，其充当被装饰类的原始对象，规定了被装饰对象的行为；
 *
 * 装饰器模式(Decorator):允许向一个现有的对象添加新的功能，同时又不改变其结构。属于结构型模式。
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 * 何时使用：在不想增加很多子类的情况下扩展类。
 * @author: yaheng
 * @date: 2022/11/16 17:47
 */
public abstract class AbstractEquip {

    private String description;

    private Integer attack;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public abstract  Integer calculateAttack();


}
