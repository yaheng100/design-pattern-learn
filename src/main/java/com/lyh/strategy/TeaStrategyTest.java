package com.lyh.strategy;

/**
 * @description:
 * @author: yahen
 * @date: 2022/11/9 23:28
 */
public class TeaStrategyTest {

    public static void main(String[] args) {
        //通过初始化环境类指定策略并执行
        TeaContext teaContext = new TeaContext(new GreenTeaStrategy());
        teaContext.executeStrategy();
        //通过lambda表达式使用 在接口中只有一个方法时可以使用lambda
        TeaContext teaContext1 = new TeaContext(() -> {
            System.out.println("黑茶使用煮茶法");
        });
        teaContext1.executeStrategy();
    }

}
