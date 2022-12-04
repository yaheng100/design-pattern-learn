package com.lyh.prototype.shallowclone;

/**
 * @description: 浅克隆原型类
 *
 * 原型模式
 * 用一个已经创建的实例作为原型，通过克隆该原型来创建一个和原型相同过的新对象
 *
 * 原型模式分为深克隆和浅克隆
 *
 * 浅克隆:通过实现Cloneable接口来实现浅克隆功能;创建一个新对象,复制原型对象所有"基本数据类型"的成员变量给新对象；
 * 对于"引用数据类型"的变量（对象、数组等）,那么浅拷贝会进行"引用传递",也就是将该成员变量的引用值（内存地址）复制一份给新对象
 * 原型和新对象的引用数据类型成员变量指向的是同一个内存地址,所以任一原型或新对象修改成员变量会影响到另一个对象的成员变量值
 *
 * 深克隆：创建一个新对象，复制原型对象所有基本数据类型的成员变量给新对象，申请新的储存空间用于引用数据类型成员变量的存储，不再进行引用传递
 * 深克隆通过重新clone()函数来实现或通过对象序列化的方式实现，推荐使用对象序列化的方式实现
 *
 * @author: yahen
 * @date: 2022/11/13 20:38
 */
public class Sheep implements Cloneable{

    private String name;

    private int age;

    private String color;

    private Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    //因为Object中的clone()方法是protected,需要重写后改为public
    @Override
    public Sheep clone() throws CloneNotSupportedException {

        return (Sheep)super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }
}
