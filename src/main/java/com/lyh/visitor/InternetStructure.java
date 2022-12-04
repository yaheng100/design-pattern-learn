package com.lyh.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 互联网数据结构类
 * 对象结构角色（Object Structure）： 这是使用访问者模式必备的角色。它要具备以下特征：能枚举它的元素；
 * 可以提供一个高层的接口以允许该访问者访问它的元素；可以是一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。
 * @author: yaheng
 * @date: 2022/11/26 23:13
 */
public class InternetStructure {

    //可以是一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。
    private List<AbstractWebSever> websiteList = new ArrayList<>();

    public void add(AbstractWebSever website){
        websiteList.add(website);
    }

    public void action(AbstractDevice device){
        for (AbstractWebSever website : websiteList) {
            website.accept(device);
        }
    }

}
