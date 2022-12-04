package com.lyh.responsibilitychain;

/**
 * @description: 注册流程抽象处理器
 * Handler（抽象处理者角色）：声明一个请求处理方法，并在其中保持一个对下一个处理节点Handler对象的引用。
 * @author: yaheng
 * @date: 2022/12/1 21:12
 */
public abstract class RegisterHandler {

    //处理器实例的下一级
    protected RegisterHandler nextHandler;

    public RegisterHandler() {

    }

    public void setNextHandler(RegisterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void doHandle(RegisterUser user);

}
