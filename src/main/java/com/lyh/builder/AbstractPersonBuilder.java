package com.lyh.builder;

/**
 * @description: 抽象建造者类 既可以是抽象类，也可以是接口
 * 建造者模式: 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * （1）Builder：给出一个抽象接口或抽象类，以规范产品的建造。
 * 	这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建，一般由子类具体实现。
 *
 * （2）ConcreteBuilder：Builder接口的实现类，并返回组建好对象实例。
 *
 * （3）Director：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，
 * 	只负责保证对象各部分完整创建或按某种顺序创建。
 *
 * （4）Product：要创建的复杂对象，产品类。
 *
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 *
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 *
 * 工厂方法模式注重整体对象的创建，创建者模式注重创造的过程和细节
 * 抽象工厂模式注重产品族的创建，创建者模式注重按照蓝图通过零配件创建单个产品
 *
 */
public abstract class AbstractPersonBuilder {

    //产品也可以在子类中声明 若再次不声明产品  可以将抽象类改为接口
    protected CarInfo carInfo = new CarInfo();

    public abstract void buildName();

    public abstract void buildPower();

    public abstract void buildEngine();

    public abstract void buildStorage();

    public CarInfo build() {
        return carInfo;
    }
}
