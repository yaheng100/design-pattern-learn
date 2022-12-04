package com.lyh.template;

/**
 * @description: 精装修模板方法类
 * ConcreteClass（具体实现类）：实现模板方法步骤中未执行的方法。
 * @author: yaheng
 * @date: 2022/11/24 1:04
 */
public class DelicateDecorateHouseTemplate extends AbstractDecorateHouseTemplate {

    @Override
    public void interiorDesign(){
        System.out.println("房屋精装修：室内设计阶段进行详细的设计");
    }

    @Override
    public void wallConstruction() {
        System.out.println("房屋精装修：墙体施工阶段根据室内设计进行铲墙、砸墙、封窗等施工");
    }

    @Override
    public void hydropowerConstruction() {
        System.out.println("房屋精装修：水电施工阶段根据室内设计进行水路、电路、照明、地暖施工");
    }

    @Override
    public void tiling() {
        System.out.println("房屋精装修：贴砖阶段根据室内设计贴墙砖及地砖、美缝工作");
    }

    @Override
    public void woodworking() {
        System.out.println("房屋精装修：木工阶段根据室内设计进行吊顶、定制木柜、橱柜等施工");
    }

    @Override
    public void whitewash() {
        System.out.println("房屋精装修：粉刷阶段根据室内设计进行墙面粉刷和调色");
    }

    @Override
    public Boolean isNeedDesign() {
        return true;
    }
}
