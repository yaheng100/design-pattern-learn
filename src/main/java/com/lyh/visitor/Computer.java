package com.lyh.visitor;

/**
 * @description: 电脑
 * 具体访问者角色（Concrete Visitor）： 实现每个由访问者角色（Visitor）声明的操作。
 * 影响访问者访问到一个类后该干什么、怎么干。
 * @author: yaheng
 * @date: 2022/11/26 23:02
 */
public class Computer extends AbstractDevice{

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public void visit(Software software) {
        System.out.println(this.name+"访问"+ software.name);
    }

    @Override
    public void visit(WebSite website) {
        System.out.println(this.name+"访问"+ website.name);
    }
}
