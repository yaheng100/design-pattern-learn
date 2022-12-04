package com.lyh.mediator;

/**
 * @description: 抽象中介者接口（Mediator）角色
 * 它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法（通信）。
 * @author: yaheng
 * @date: 2022/11/22 1:42
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void sendMessage(Colleague from,String to,String message);

}
