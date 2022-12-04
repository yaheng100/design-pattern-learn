package com.lyh.visitor.assign;

/**
 * @description: 双分派实现动态分派
 * 双分派实现动态绑定的本质，就是在重载方法委派的前面加上了继承体系中覆盖的环节，由于覆盖是动态的，所以重载就是动态的了
 * @author: yaheng
 * @date: 2022/11/27 0:15
 */
public class DoubleDispatch {

    public static class Animal {
        //因为Execute中的3个execute函数重载的
        //将自己this作为参数传递进去，这里就完成了第二次分派
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }

    public static class Dog extends Animal {
        //因为Execute中的3个execute函数重载的
        //将自己this作为参数传递进去，这里就完成了第二次分派
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }

    public static class Cat extends Animal {
        //因为Execute中的3个execute函数重载的
        //将自己this作为参数传递进去，这里就完成了第二次分派
        public void accept(Execute exe) {
            exe.execute(this);
        }
    }

    public static class Execute {
        //Execute中的3个execute函数重载的
        public void execute(Animal a) {
            System.out.println("animal");
        }

        public void execute(Dog d) {
            System.out.println("dog");
        }

        public void execute(Cat c) {
            System.out.println("cat");
        }
    }

    public static void main(String[] args) {
        //此处静态类型均为Animal
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();


        Execute exe = new Execute();
        // 因为方法重写是根据实际类型判断的
        // accept方法的调用是 根据实际类型判断的
        //这里a实际类型是Animal
        a.accept(exe);
        //这里d实际类型是Dog
        d.accept(exe);
        //这里c实际类型是Cat
        c.accept(exe);
        //在上面代码中，客户端将Execute对象做为参数传递给Animal类型的变量调用的方法，这里完成第一次分派
        // Dog Cat 的accept()方法是继承Animal后重写的
        // 因为方法重写是根据实际类型判断的（java规则）
        // 所以这里accept()方法的调用是是动态分派，也就是执行实际类型中的方法

    }


}
