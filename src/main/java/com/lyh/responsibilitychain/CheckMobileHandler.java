package com.lyh.responsibilitychain;

import java.util.Random;

/**
 * @description: 手机号校验器
 * ConcreteHandler（具体处理者角色）：对请求进行处理，如果不能处理则将请求转发给下一个节点上的处理对象。
 * @author: yaheng
 * @date: 2022/12/1 22:09
 */
public class CheckMobileHandler extends RegisterHandler {


    @Override
    public void doHandle(RegisterUser user) {
        if(checkMobile(user)){
            System.out.println("手机号校验通过");
            this.nextHandler.doHandle(user);
        }else {
            System.out.println("手机号不可用");
        }
    }


    private Boolean checkMobile(RegisterUser user){
        //TODO 检查手机号是否合法 是否被占用
        //此处简单判断
        return user.getMobile().length() == 11;
    }

}
