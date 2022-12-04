package com.lyh.composite;

/**
 * @description: 末级部门
 * 叶子节点：其下再无节点、分支，是系统最低层次对象，失去部分可扩展节点的功能
 * 在组合模式中有此角色，但在实际应用中可以不使用此角色 （例：可以无限向下扩展的树结构）
 * @author: yaheng
 * @date: 2022/11/17 23:26
 */
public class LeafOrganization extends Organization {

    public LeafOrganization(String name, Integer level) {
        super(name, level);
    }


    @Override
    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("--");
        }
        System.out.println(getName());
    }
}
