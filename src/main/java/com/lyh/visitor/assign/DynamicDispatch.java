package com.lyh.visitor.assign;

/**
 * @description: 通过重写实现冬天分派
 * @author: yaheng
 * @date: 2022/11/27 0:01
 */
public class DynamicDispatch {


    public static class Animal {
        public void execute() {
            System.out.println("Animal");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void execute() {
            System.out.println("dog");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void execute() {
            System.out.println("cat");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.execute();

        Animal a1 = new Cat();
        a1.execute();
    }


}
