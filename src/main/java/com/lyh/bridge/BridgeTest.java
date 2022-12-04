package com.lyh.bridge;

/**
 * @description: 桥接模式测试类
 * 桥接(Bridge模式)是指：将实现和抽象放在不同的抽象类中，使两个层次可以独立改变。
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系
 * 关键代码：抽象类依赖实现类。
 * 对于两个独立变化的维度，使用桥接模式再适合不过了。 也可以超过2个维度 可以全部使用抽象类再额外持有（嵌套）抽象类
 *
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 * 缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 * @author: yaheng
 * @date: 2022/11/14 22:35
 */
public class BridgeTest {

    public static void main(String[] args) {
        Product product = new MobilePhone(new HuaweiCompany());
        product.showProductInfo();

        Product product1 = new Pad(new HuaweiCompany());
        product1.showProductInfo();

        Product product2 = new MobilePhone(new XiaoMiCompany());
        product2.showProductInfo();

    }



}
