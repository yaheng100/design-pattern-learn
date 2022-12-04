package com.lyh.bridge;

/**
 * @description: 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * @author: yaheng
 * @date: 2022/11/14 22:33
 */
public class Pad extends Product{


    public Pad(Company company) {
        super(company);
    }

    @Override
    public void showProductInfo() {
        String companyName = company.showCompanyName();
        System.out.println("欢迎购买"+companyName +"平板");
    }
}
