package com.lyh.factory.simplefactory;

/**
 * @description: 简单工厂模式
 * 此类属于简单工厂模式中的具体工厂类
 * 优点：将产品的创建过程封装在工厂类中，把产品对象的创建和业务逻辑分开，如果需要新增产品只需修改工厂类，不需要修改业务代码
 * 缺点：新增产品是需要修改工厂类，不符合“开闭原则”
 * @author: yahen
 * @date: 2022/11/10 23:48
 */
public class SimpleTeaFactory {

    //第一种形式  通过type判断创建什么对象
    public Tea createTea(String type) throws Exception {
        if (type.equals("green")) {
            return new GreenTea();
        } else if (type.equals("red")) {
            return new RedTea();
        } else {
            throw new Exception("未知类型");
        }
    }

    //第二种形式 每个对象都定义一个创建方法
    public RedTea createRedTea(){
        return new RedTea();
    }

    public GreenTea createGreenTea(){
        return new GreenTea();
    }
}
