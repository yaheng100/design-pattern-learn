package com.lyh.mediator;

/**
 * @description: 中介者模式测试类
 * @author: yaheng
 * @date: 2022/11/22 2:29
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new InternationalChatServer();
        ChinaUser wanAnShi = new ChinaUser("王安石", mediator);
        ChinaUser suShi = new ChinaUser("苏轼", mediator);
        USAUser james = new USAUser("James",mediator);
        USAUser john = new USAUser("John",mediator);

        wanAnShi.sendMessage(suShi.getName(),"我是王安石");
        suShi.sendMessage(wanAnShi.getName(),"我是苏轼");

        james.sendMessage(john.getName(),"hello i`m james");
        john.sendMessage(john.getName(),"hello i`m john");

        wanAnShi.sendMessage(john.getName(),"外国人你好");
        john.sendMessage(wanAnShi.getName(), "what are you talking about?");
    }
}
