package com.lyh.visitor.assign;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/27 0:04
 */
public class StaticDispatch {

    public static class Animal {
    }

    public static class Dog extends Animal {
    }

    public static class Cat extends Animal {
    }

    public static class Execute {
        public void execute(Animal a) {
            System.out.println("Animal");
        }

        public void execute(Dog d) {
            System.out.println("dog");
        }

        public void execute(Cat c) {
            System.out.println("cat");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        Execute exe = new Execute();
        exe.execute(a);
        exe.execute(a1);
        exe.execute(a2);

        //此处输出
        //Animal
        //Animal
        //Animal
        //这个结果可能出乎一些人的意料了，为什么呢？
        //重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
    }


}
