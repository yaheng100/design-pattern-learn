package com.lyh.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/28 0:15
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
       return new ConcreteIterator<T>(list);
    }
}
