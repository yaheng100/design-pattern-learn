package com.lyh.decorator;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/16 19:58
 */
public class DecoratorTest {

    public static void main(String[] args) {
        AbstractEquip equip = new BodyEquip();
        System.out.println(equip.getDescription());
        System.out.println(equip.calculateAttack());

        equip = new WoodGem(equip);
        System.out.println(equip.getDescription());
        System.out.println(equip.calculateAttack());

        System.out.println("===============");

        AbstractEquip equip1 = new WoodGem(new LegsEquip());
        System.out.println(equip1.getDescription());
        System.out.println(equip1.calculateAttack());

        equip1 = new FireGem(equip1);
        System.out.println(equip1.getDescription());
        System.out.println(equip1.calculateAttack());

    }

}
