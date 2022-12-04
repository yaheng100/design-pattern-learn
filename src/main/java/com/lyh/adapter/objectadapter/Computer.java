package com.lyh.adapter.objectadapter;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/11/14 18:20
 */

public class Computer {

   private IUSBSocket usbSocket;

    public Computer( IUSBSocket usbSocket ) {
        this.usbSocket = usbSocket;
    }

    public void transDataByUSB(String data) throws Exception {
        System.out.println("电脑将通过USB传输数据:"+data);
        if (usbSocket == null ) {
            throw new Exception("电脑传输数据须使用USB接口");
        }
        usbSocket.transDataByUSB(data);

    }

}
