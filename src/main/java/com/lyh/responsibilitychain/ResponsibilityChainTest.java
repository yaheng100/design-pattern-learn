package com.lyh.responsibilitychain;

/**
 * @description: 责任链模式测试类
 * @author: yaheng
 * @date: 2022/12/1 22:41
 */
public class ResponsibilityChainTest {

    public static void main(String[] args) {
        //用户注册信息校验责任链
        RegisterUser registerUser = new RegisterUser();
        registerUser.setMobile("18890904545");
        registerUser.setName("张三");
        registerUser.setSmsCode("123456");
        registerUser.setIdCard("411012199504128899");

        //创建校验器
        //手机号校验器
        CheckMobileHandler checkMobileHandler = new CheckMobileHandler();
        //身份证号校验器
        CheckIdCardHandler checkIdCardHandler = new CheckIdCardHandler();
        //验证码检验器
        CheckSmsCodeHandler checkSmsCodeHandler = new CheckSmsCodeHandler();

        //组成链  checkMobileHandler为链头
        checkMobileHandler.setNextHandler(checkSmsCodeHandler);
        checkSmsCodeHandler.setNextHandler(checkIdCardHandler);
        //执行责任链 从链头开始！
        checkMobileHandler.doHandle(registerUser);


    }


}
