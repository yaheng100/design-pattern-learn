package com.lyh.template;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/24 1:15
 */
public class TemplateTest {

    public static void main(String[] args) {
        AbstractDecorateHouseTemplate template = new DelicateDecorateHouseTemplate();
        System.out.println("精装修房屋施工流程：");
        template.decorateHouseProcess();
        //可以再定义一个简装类 此处偷个懒
    }
}
