package com.lyh.mediator;

import com.lyh.bridge.HuaweiCompany;

import java.util.HashMap;

/**
 * @description: 国际聊天服务器
 * 具体中介类
 * @author: yaheng
 * @date: 2022/11/22 2:20
 */

public class InternationalChatServer extends Mediator {

    private HashMap<String,Colleague> chatUserMap = new HashMap<>();

    @Override
    public void register(Colleague colleague) {
        chatUserMap.put(colleague.name,colleague);
    }

    @Override
    public void sendMessage(Colleague from, String to, String message) {
        Colleague targetUser = chatUserMap.get(to);
        if(targetUser == null){
            System.out.println(from+"发送失败: 目标用户不存在");
            throw new RuntimeException("目标用户不存在");
        }
        targetUser.receiveMessage(from.getName(),message);
    }

    //自己实现了双人聊天 若需要实现群聊则可以再实现一个中介者 写出群聊中介者逻辑
    //此处偷懒不再单独实现群聊中介者 只写出群聊消息
    public void sendMessage(Colleague from,String message) {

        chatUserMap.forEach((key,value) ->{
            value.receiveMessage(from.getName(),message);
        });

    }


}
