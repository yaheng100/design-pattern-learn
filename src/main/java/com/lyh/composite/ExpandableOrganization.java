package com.lyh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 可扩展的组织架构类
 * 树枝节点角色（非叶子节点）：定义非叶子节点功能、行为，储存子节点，组合节点构成树形结构
 * @author: yaheng
 * @date: 2022/11/17 23:09
 */
public class ExpandableOrganization extends Organization {

    private List<Organization> list = new ArrayList<>();


    public ExpandableOrganization(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void add(Organization organization) {
        list.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        list.remove(organization);
    }

    @Override
    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("--");
        }
        System.out.println(getName());
        for (Organization org : list) {
            org.print();
        }
    }
}
