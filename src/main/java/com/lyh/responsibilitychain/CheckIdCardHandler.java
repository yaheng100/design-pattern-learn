package com.lyh.responsibilitychain;


/**
 * @description:
 * ConcreteHandler（具体处理者角色）：对请求进行处理，如果不能处理则将请求转发给下一个节点上的处理对象。
 *
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 *
 * 责任链模式属于行为型设计模式。它的定义为：使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，【直到有对象处理它】 或 【责任链进行结束】 为止。
 *
 * 优点： 1、降低耦合度。它将请求的发送者和接收者解耦。 2、简化了对象。使得对象不需要知道链的结构。 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 4、增加新的请求处理类很方便。
 * 缺点： 1、不能保证请求一定被接收。 2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 3、可能不容易观察运行时的特征，有碍于除错。
 *
 * Handler（抽象处理者角色）：声明一个请求处理方法，并在其中保持一个对下一个处理节点Handler对象的引用。
 * ConcreteHandler（具体处理者角色）：对请求进行处理，如果不能处理则将请求转发给下一个节点上的处理对象。
 *
 *
 * @author: yaheng
 * @date: 2022/12/1 22:09
 */
public class CheckIdCardHandler extends RegisterHandler {


    @Override
    public void doHandle(RegisterUser user) {
        if(checkIdCard(user)){
            System.out.println("身份信息检验成功，用户注册完成");
        }else {
            System.out.println("身份证信息错误");
        }
    }


    private Boolean checkIdCard(RegisterUser user){
        //TODO 检查验证码是否合法
        //此处简单判断
        return user.getIdCard()!=null && user.getIdCard().length()==18;
    }

}
