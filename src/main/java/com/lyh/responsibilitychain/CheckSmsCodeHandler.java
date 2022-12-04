package com.lyh.responsibilitychain;


/**
 * @description: 验证码校验器
 * ConcreteHandler（具体处理者角色）：对请求进行处理，如果不能处理则将请求转发给下一个节点上的处理对象。
 * @author: yaheng
 * @date: 2022/12/1 22:09
 */
public class CheckSmsCodeHandler extends RegisterHandler {


    @Override
    public void doHandle(RegisterUser user) {
        if(checkSmsCode(user)){
            System.out.println("验证码校验通过");
            this.nextHandler.doHandle(user);

        }else {
            System.out.println("验证码错误");
        }
    }


    private Boolean checkSmsCode(RegisterUser user){
        //TODO 检查验证码是否合法
        //此处简单判断
        return user.getSmsCode()!= null && user.getSmsCode().length() == 6 && user.getSmsCode().equals("123456");
    }

}
