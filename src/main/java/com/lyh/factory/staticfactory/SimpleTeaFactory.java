package com.lyh.factory.staticfactory;

/**
 * @description: 静态工厂模式
 * 为简单工厂模式的扩展
 * 此类属于静态工厂模式中的具体工厂类  将createTea定义为静态方法
 * 创建Tea时就不需要再 new SimpleTeaFactory() 可以通过SimpleTeaFactory类直接调用createTea()
 * @author: yahen
 * @date: 2022/11/10 23:48
 */
public class SimpleTeaFactory {

    //第一种形式  通过type判断创建什么对象
    public static Tea createTea(String type) throws Exception {
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
