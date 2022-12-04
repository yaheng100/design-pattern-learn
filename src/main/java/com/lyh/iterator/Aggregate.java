package com.lyh.iterator;

/**
 * @description: 容器接口 泛型
 * Aggregate（抽象容器接口）：提供创建具体迭代器角色的接口
 *
 * 迭代器模式属于行为型模式。它提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * Iterator（迭代器接口）：定义、访问和遍历元素的接口
 * ConcreteIterator（具体迭代器类）：实现迭代器接口，并记录遍历的当前位置
 * Aggregate（容器接口）：提供创建具体迭代器角色的接口
 * ConcreteAggregate（具体容器类）：实现容器接口功能
 *
 * 个人理解：
 * 这个模式比较古老，很多语言也会自带这种模式，比如Java中的List、Map、数组等也已经封装了这种方法了。
 * 实际开发中我们已经不会再使用这个模式了。for循环、foreach循环已经很满足我们的开发需求了。
 *
 *
 * JDK源码解析
 * 迭代器模式在JAVA的很多集合类中被广泛应用，接下来看看JAVA源码中是如何使用迭代器模式的
 * 以ArrayList为例：
 * List：抽象聚合类
 * ArrayList：具体的聚合类
 * Iterator：抽象迭代器
 * ArrayList.iterator()：返回的是实现了 Iterator 接口的具体迭代器对象
 *
 * 当我们在使用JAVA开发的时候，想使用迭代器模式的话，
 * 只要让我们自己定义的容器类实现java.util.Iterable并实现其中的iterator()方法使其返回一个 java.util.Iterator 的实现类就可以了。
 *
 * @author: yaheng
 * @date: 2022/11/28 0:14
 */
public interface Aggregate<T> {

    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();

}
