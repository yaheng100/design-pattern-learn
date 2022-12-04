package com.lyh.composite;

/**
 * @description: 组合模式测试类
 * @author: yaheng
 * @date: 2022/11/17 23:31
 */
public class CompositeTest {

    public static void main(String[] args) {
        Organization root = new ExpandableOrganization("总公司", 1);
        //创建分公司
        Organization companyHn = new ExpandableOrganization("河南分公司", 2);
        Organization companyJs = new ExpandableOrganization("江苏分公司", 2);
        //创建部门
        Organization dept = new ExpandableOrganization("技术部", 3);
        //创建部门小组（不可再扩展）
        Organization groupA = new LeafOrganization("A项目组", 4);

        root.add(companyHn);
        root.add(companyJs);
        companyHn.add(dept);
        dept.add(groupA);

        root.print();

    }

}
