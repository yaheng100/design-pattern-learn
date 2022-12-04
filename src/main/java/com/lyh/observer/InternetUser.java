package com.lyh.observer;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/28 22:21
 */
public class InternetUser extends Observer {

    public InternetUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"收到："+message);
    }
}
