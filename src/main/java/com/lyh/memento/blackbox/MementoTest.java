package com.lyh.memento.blackbox;


/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/1 2:16
 */
public class MementoTest {
    public static void main(String[] args) {
        GameProgress gameProgress = new GameProgress();
        gameProgress.setRoleLevel(1);
        gameProgress.setProgress("新手关卡");
        gameProgress.setCurrency(0);

        System.out.println("进入游戏存档");
        GameCaretaker gameCaretaker = new GameCaretaker();
        gameCaretaker.addMemento("新手关卡",gameProgress.saveGameProgress());

        System.out.println("玩至第三关后存档");
        gameProgress.setRoleLevel(3);
        gameProgress.setProgress("第二关");
        gameProgress.setCurrency(10);
        gameCaretaker.addMemento("第三关",gameProgress.saveGameProgress());

        System.out.println("不熟悉操作重玩新手关");
        gameProgress.readMemento(gameCaretaker.getMemento("新手关卡"));
        System.out.println(gameProgress);

        System.out.println("操作熟练后继续从第三关玩");
        gameProgress.readMemento(gameCaretaker.getMemento("第三关"));
        System.out.println(gameProgress);



    }
}
