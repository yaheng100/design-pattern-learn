package com.lyh.visitor;

/**
 * @description: 软件类
 * 具体元素角色（Concrete Element）:实现由元素角色提供的Accept操作。实现accept方法，通常是visitor.visit(this)。
 * @author: yaheng
 * @date: 2022/11/26 22:58
 */
public class Software extends AbstractWebSever {

    public Software(String name){
        this.name = name;
    }

    @Override
    public void accept(AbstractDevice abstractDevice) {
        abstractDevice.visit(this);
        System.out.println("软件"+this.name+"接收到来自："+abstractDevice.name+"的访问");
    }
}
