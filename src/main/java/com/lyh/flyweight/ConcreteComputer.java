package com.lyh.flyweight;

/**
 * @description: 网咖电脑
 *
 *
 * Flyweight 模式：通过共享技术实现相同或相似对象的重用，减少创建对象的数量，以减少内存占用和提高性能。
 * 意图：运用共享技术有效地支持大量细粒度的对象。
 * 动机：面向对象技术可以很好地解决一些灵活性或可扩展性问题，但在很多情况下需要在系统中增加类和对象的个数。当对象数量太多时，将导致运行代价过高，带来性能下降等问题。。
 * 核心思想：在有大量对象时，将消耗大量内存，甚至可能造成内存溢出，享元模式把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 *
 * 1）享元模式提出了两个要求:细粒度和共享对象。这里就涉及到内部状态和外部状态了，即将对象的信息分为两个部分:内部状态和外部状态
 * 2）内部状态指对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变
 * 3）外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
 *
 * Flyweight（抽象享元角色）：抽象类或接口，Flyweight可以接受并作用于外部状态。
 * ConcreteFlyweight（具体享元角色）：实现Flyweight接口，并为内部状态增加存储空间。
 * UnSharedConcreteFlyweight（不可共享的享元角色）：指那些不需要共享的Flyweight子类。不可共享的享元角色不需要从工厂中创建，直接new即可。
 * FlyweightFactory（享元工厂）：提供一个已创建的Flyweight对象或创建一个Flyweight对象（如果不存在的话）。
 *
 *
 *
 * @author: yaheng
 * @date: 2022/11/23 0:27
 */
public class ConcreteComputer extends InternetCafeComputer  {

    public ConcreteComputer(Integer sn, String status) {
        this.sn = sn;
        this.status = status;
    }

    @Override
    public void use(String runGames) {
        if(getStatus().equals("0")){
            System.out.printf("%s号机已上机，开始享玩%s游戏",getSn(),runGames);
            System.out.println();
            setStatus("1");
        }else {
            System.out.printf("%s机未下机，正在享玩%s游戏",getSn(),runGames);
            System.out.println();
        }
    }

    @Override
    public void endUser(String runGames) {
        setStatus("0");
        System.out.printf("%s机已下机",getSn());
        System.out.println();
    }
}
