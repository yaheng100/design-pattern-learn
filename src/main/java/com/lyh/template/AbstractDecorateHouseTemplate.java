package com.lyh.template;

/**
 * @description: 装修模板方法
 * AbstractClass（抽象模板类）：定义了一套算法框架。
 * 模板模式(Template Pattern),在一个抽象类公开定义了执行它的方法的模板.它的子类可以按需要重写方法实现,但是调用将以抽象类中定义的方式进行.
 * 简单的说,模板方法模式 定义一个操作中的算法的骨架,而将一些步骤延迟到子类中,使得子类可以不改变一个算法结构,就可以重定义该算法的某些特定步骤
 * 或者说定义一个操作的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的框架即可重定义该算法的某些特定步骤。
 *
 * 核心：处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定。因此，我们采用模板方法模式，将这个节点的代码实现转移给
 * 子类完成。即：处理步骤在父类中定义好，具体的实现延迟到子类中定义。
 *
 * 优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 * 使用场景： 1、有多个子类共有的方法，且逻辑相同。 2、重要的、复杂的方法，可以考虑作为模板方法。
 * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 * @author: yaheng
 * @date: 2022/11/24 0:37
 */
public abstract class AbstractDecorateHouseTemplate {



    //模版方法
    //一个模板方法是定义在抽象类中的，把基本操作方法组合在一起形成一个总算法或一个总行为的方法。
    //一个抽象类可以有任意多个模板方法，而不限于一个。每一个模板方法都可以调用任意多个具体方法。
    public final void decorateHouseProcess(){
        //使用钩子方法控制是否需要室内设计
        if(isNeedDesign()){
            interiorDesign();
        }
        wallConstruction();
        hydropowerConstruction();
        waterproof();
        tiling();
        woodworking();
        whitewash();
        decorateFinishing();
    }


    //室内设计
    public abstract void interiorDesign();

    //墙体施工
    public abstract void wallConstruction();

    //水电施工
    public abstract void hydropowerConstruction();

    //防水施工 具体方法  装修中防水施工是必要的
    //一个具体方法由抽象类声明并实现，而子类并不实现或置换。它是子类不可更改的方法。
    public void waterproof(){
        System.out.println("房屋装修：极其必要的防水施工");
    }

    //贴砖
    public abstract void tiling();

    //木工
    public abstract void woodworking();

    //粉刷
    public abstract void whitewash();

    //收尾 具体方法
    public void decorateFinishing(){
        System.out.println("房屋装修：收尾阶段进行卫生开荒");
    }

    // 钩子方法
    public abstract Boolean isNeedDesign();

}
