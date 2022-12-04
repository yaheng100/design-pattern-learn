package com.lyh.prototype.deepclone;



/**
 * @description:
 * @author: yahen
 * @date: 2022/11/13 22:00
 */
public class DeepCloneTest {

    public static void main(String[] args) throws Exception {
        Sheep sheep = new Sheep("肖恩", 1, "白色");
        sheep.setFriend(new Sheep("佩奇", 1, "白色"));

        //重写克隆方法  1.手动处理引用类型变量的克隆
        Sheep sheep1 = sheep.clone();
        System.out.println("==============");
        //深拷贝后发现原型和新对象的friend值相同但hashcode不相同 所以深拷贝实现成功
        System.out.println("sheep："+ sheep+",friend:"+sheep.getFriend().hashCode());
        System.out.println("sheep1："+sheep1+",friend:"+sheep1.getFriend().hashCode());

        //重写克隆方法  2.完整对象序列化
        Sheep sheep2 = sheep.clone1();
        System.out.println("==============");
        System.out.println("sheep："+ sheep+",friend:"+sheep.getFriend().hashCode());
        System.out.println("sheep2："+sheep1+",friend:"+sheep2.getFriend().hashCode());


    }

}
