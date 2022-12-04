package com.lyh.command;

/**
 * @description: 单个命令调用类
 *
 * @author: yaheng
 * @date: 2022/11/25 17:24
 */
public class IotControl {

    private IotCommand iotCommand ;


    public IotControl(IotCommand iotCommand) {
        this.iotCommand = iotCommand;
    }

    public void setIotCommand(IotCommand iotCommand) {
        this.iotCommand = iotCommand;
    }

    public void execute(){
        iotCommand.execute();
    }

    public void undo(){
        iotCommand.undo();
    }


}
