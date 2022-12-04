package com.lyh.flyweight;

import java.util.HashMap;

/**
 * @description: 网咖电脑享元工厂
 * 享元工厂(FlyWeightFactory):负责创建和管理享元角色。
 * 当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 * @author: yaheng
 * @date: 2022/11/23 0:39
 */
public class InternetCafeComputerFactory {

    //具体享元池
    public static HashMap<Integer, InternetCafeComputer> pool = new HashMap<>();

    private static InternetCafeComputerFactory factory = new InternetCafeComputerFactory();

    //饿汉单例
    public static InternetCafeComputerFactory getInstance() {
        return factory;
    }

    //为了方便直接初始化三个具体享元 （这个例子不太恰当 所以无法实现另一种写法）
    //常见另一种写法为：
    //先获取 获取不到创建 然后放入池中 再返回
    //获取到就反馈
    public InternetCafeComputerFactory() {
        for (int i = 1; i < 3; i++) {
            ConcreteComputer concreteComputer = new ConcreteComputer(i, "0");
            pool.put(i, concreteComputer);
        }
    }

//    public InternetCafeComputer get(Integer sn) {
        //常见另一种写法为：
        //先获取 获取不到创建 然后放入池中 再返回
        //获取到就返回
//        return pool.get(sn);
//    }

    public InternetCafeComputer get() {
        for (Integer key: pool.keySet()){
            InternetCafeComputer internetCafeComputer = pool.get(key);
            if(internetCafeComputer.status.equals("0")){
                return internetCafeComputer;
            }
        }
        throw new RuntimeException("暂无可用机");
    }

}
