package com.lyh.iterator;

import java.util.List;

/**
 * @description: 抽象迭代器 泛型
 * Iterator（迭代器接口）：定义、访问和遍历元素的接口
 * @author: yaheng
 * @date: 2022/11/27 23:56
 */
public interface Iterator<T> {

    //是否有下一个元素
    Boolean hasNext();

    //获取下一个元素
    T next();


}
