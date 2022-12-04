package com.lyh.command;

/**
 * @description: 电视关机命令
 * @author: yaheng
 * @date: 2022/11/25 17:06
 */
public class TvOffCommand extends IotCommand{

    private TvReceiver tvReceiver;

    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.open();
    }
}
