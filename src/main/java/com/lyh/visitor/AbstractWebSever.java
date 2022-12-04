package com.lyh.visitor;

/**
 * @description: 网络服务类
 * Element（抽象元素）：定义一个接受访问者的方法accept(Visitor v)。指每一个元素都可以被访问者访问。
 * 此处为接口后抽象类，用于声明接受哪一类访问者访问，程序上是通过accpet方法中的参数来定义的。
 * @author: yaheng
 * @date: 2022/11/26 22:03
 */
public abstract class AbstractWebSever {

    protected String name;

    public abstract void accept(AbstractDevice abstractDevice);

}
