package com.lyh.bridge;

/**
 * @description: 具体实现类（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 * @author: yaheng
 * @date: 2022/11/14 22:19
 */
public class HuaweiCompany implements Company {
    private static final String NAME = "华为";
    @Override
    public String showCompanyName() {
        System.out.println("华为遥遥领先于同行");
        return NAME;
    }
}
