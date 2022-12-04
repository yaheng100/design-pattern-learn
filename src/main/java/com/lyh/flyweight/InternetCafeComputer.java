package com.lyh.flyweight;

/**
 * @description: 网吧电脑类
 * 抽象享元角色(FlyWeight):享元对象抽象基类或者接口,同时定义出对象的外部状态和内部状态的接口或实现;
 * @author: yaheng
 * @date: 2022/11/22 23:34
 */
public abstract class InternetCafeComputer {

    //内部状态指对象共享出来的信息，存储在享元信息内部，并且不回随环境的改变而改变；
    //座位号
    protected Integer sn;

    //外部状态指对象得以依赖的一个标记，随环境的改变而改变，不可共享。
    //使用状态 0-未使用 1-使用中
    protected String status;
    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void use(String runGames);

    public abstract void endUser(String runGames);

}
