package com.lyh.iterator;


/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/28 0:20
 */
public class IteratorTest {

    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();

        aggregate.add("张三");
        aggregate.add("李四");
        aggregate.add("王五");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }


}
