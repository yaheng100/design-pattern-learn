package com.lyh.visitor;

/**
 * @description: 设备终端类
 * Visitor（抽象访问者）：它定义了对每一个元素（Element）访问的行为，此处可为抽象类或接口，
 * 用于声明访问者可以访问哪些元素，具体到程序中就是visit方法的参数定义哪些对象是可以被访问的。
 * 它的参数就是可以访问的元素，它的方法数理论上来讲与元素个数是一样的，
 * 因此，访问者模式要求元素的类族要稳定，如果经常添加、移除元素类，必然会导致频繁地修改Visitor接口，如果这样则不适合使用访问者模式。
 *
 * Visitor模式也叫访问者模式，是行为模式之一 ，它分离对象的数据和行为，使用Visitor模式， 可以不修改已有类的情况下，增加新的操作。
 * 它的基本思想是：将数据操作与数据结构分离，将一些稳定的对象的类拥有一个accept方法用来接收访问者访问。
 *
 * 应用场景
 * 对象结构比较稳定，但是需要在对象结构的基础上定义新的操作。
 * 需要对同一个类的不同对象执行不不同的操作，但是不希望增加操作的时候改变这些类。
 *
 * 总结
 * 准确识别出Visitor实用的场景，如果一个对象结构不稳定决不可使用，不然在增删元素时改动将非常巨大。
 * 对象结构中的元素要可以迭代访问
 * Visitor里一般存在与元素个数相同的visit方法。
 * 元素通过 this 方法通过 accept 将自己传递给了Visitor。
 *
 * 特点：
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
 * 访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。
 *
 * 优点：
 *
 * 使得数据结构和作用于结构上的操作解耦，使得操作集合可以独立变化。
 * 添加新的操作或者说访问者会非常容易。
 * 将对各个元素的一组操作集中在一个访问者类当中。
 * 使得类层次结构不改变的情况下，可以针对各个层次做出不同的操作，而不影响类层次结构的完整性。
 * 可以跨越类层次结构，访问不同层次的元素类，做出相应的操作。
 * 使得给结构稳定的对象增加新算法变得容易，提搞了代码的可维护性，可扩展性。
 *
 * 缺点：
 * 增加新的元素会非常困难。
 * 实现起来比较复杂，会增加系统的复杂性。
 * 破坏封装，如果将访问行为放在各个元素中，则可以不暴露元素的内部结构和状态，
 * 但使用访问者模式的时候，为了让访问者能获取到所关心的信息，
 * 元素类不得不暴露出一些内部的状态和结构，就像收入和支出类必须提供访问金额和单子的项目的方法一样。
 *
 * 适用性：
 * 数据结构稳定，作用于数据结构的操作经常变化的时候。
 * 当一个数据结构中，一些元素类需要负责与其不相关的操作的时候，为了将这些操作分离出去，以减少这些元素类的职责时，可以使用访问者模式。
 * 有时在对数据结构上的元素进行操作的时候，需要区分具体的类型，这时使用访问者模式可以针对不同的类型，在访问者类中定义不同的操作，从而去除掉类型判断。

 */
public abstract class AbstractDevice {

    protected String name;

    public abstract void visit(Software software);

    public abstract void visit(WebSite website);
}
