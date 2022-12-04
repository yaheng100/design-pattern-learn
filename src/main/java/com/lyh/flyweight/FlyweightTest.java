package com.lyh.flyweight;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/23 0:57
 */
public class FlyweightTest {
    public static void main(String[] args) {
        InternetCafeComputer internetCafeComputer = InternetCafeComputerFactory.getInstance().get();
        internetCafeComputer.use("英雄联盟");
        //若下面一行注释掉不下机 则可以复现出无具体享元对象可用
        internetCafeComputer.endUser("英雄联盟");


        InternetCafeComputer internetCafeComputer1 = InternetCafeComputerFactory.getInstance().get();
        internetCafeComputer1.use("穿越火线");


        InternetCafeComputer internetCafeComputer2 = InternetCafeComputerFactory.getInstance().get();
        internetCafeComputer2.use("梦幻西游");
        //比较内存地址为true 可以得出具体享元类被二次使用
        System.out.println(internetCafeComputer == internetCafeComputer1);

    }
}
