package com.lyh.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 智能家具综合遥控器
 * @author: yaheng
 * @date: 2022/11/25 17:14
 */
public class IotCompositeControl {

    //遥控器这里使用单例模式
    private static final IotCompositeControl INSTANCE = new IotCompositeControl();

    //命令的集合
    private  List<IotCommand> commands = new ArrayList<>(7);

    private IotCommand undoCommand = new NoCommand();

    private IotCommand redoCommand = new NoCommand();

    //私有构造函数 单例初始化时使用
    private IotCompositeControl() {
        for (int i = 0; i < 7; i++) {
            commands.add(undoCommand);
        }
    }

    public void setCommand(int i, IotCommand command) {
        commands.set(i, command);
    }

    public static IotCompositeControl getInstance() {
        return INSTANCE;
    }

    public void execute(int i) {
        commands.get(i).execute();
        this.undoCommand = commands.get(i);
        this.redoCommand = commands.get(i);
    }

    //为什么需要undo
    // 很多时候，我们再操作完，命令之后，我们发现，这个功能不是我们想要的，
    // 比如我们在文本编辑中，误删除了文本，我们希望通过回退操作，达到之前的状态。
    // 比如本例子，我们打开了灯，但是之后发现，我们不需要开灯，我们也可以通过undo能撤销刚才的命令
    public void undo() {
        undoCommand.undo();
    }

    //为社么需要redo
    //单个命令需要重复执行，比如电视机换台
    public void redo() {
        redoCommand.execute();
    }

}
