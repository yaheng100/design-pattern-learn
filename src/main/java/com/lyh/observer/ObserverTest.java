package com.lyh.observer;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/28 22:27
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new InternetBlogger("罗翔");

        InternetUser user = new InternetUser("法外狂徒张三");
        InternetUser user1 = new InternetUser("法考学生李四");
        InternetUser user2 = new InternetUser("吃惯群众王五");

        subject.attach(user);
        subject.attach(user1);
        subject.attach(user2);

        subject.notify("发布了新视频《回头是岸-论自首的好处》");
        subject.notify("开启了直播：讨论一下自首相关流程");

        subject.detach(user);

    }

}
