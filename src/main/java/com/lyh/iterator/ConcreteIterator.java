package com.lyh.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/28 0:00
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list ;

    private int position = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public Boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        T t = null;
        if(hasNext()){
            t = list.get(position);
            position++;
        }
        return t;
    }
}
