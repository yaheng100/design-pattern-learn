package com.lyh.prototype.shallowclone;

/**
 * @description: 浅克隆测试
 * @author: yahen
 * @date: 2022/11/13 21:08
 */
public class ShallowCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("肖恩", 1, "白色");

        //浅克隆 并检查克隆结果
        Sheep sheep1 = sheep.clone();
        System.out.println("sheep："+ sheep);
        System.out.println("sheep1："+sheep1);

        //给原型引用类型复制并再次克隆
        sheep.setFriend(new Sheep("佩奇", 1, "白色"));

        //通过hashcode()方法检查 ，由hash值相同可以得出应用类型的克隆是"引用传递"
        Sheep sheep2 = sheep.clone();
        System.out.println("==============");
        System.out.println("sheep："+ sheep+",friend:"+sheep.getFriend().hashCode());
        System.out.println("sheep2："+sheep2+",friend:"+sheep2.getFriend().hashCode());

        //修改任一对象friend的值再观察另一个对象的friend值及hashcode 发现也随之变化
        System.out.println("==============");
        sheep2.getFriend().setColor("灰色");
        System.out.println("修改friend值后sheep："+ sheep);
        System.out.println("修改friend值后sheep2："+sheep2);
        System.out.println("sheep："+ sheep+",friend:"+sheep.getFriend().hashCode());
        System.out.println("sheep2："+sheep2+",friend:"+sheep2.getFriend().hashCode());

    }

}
