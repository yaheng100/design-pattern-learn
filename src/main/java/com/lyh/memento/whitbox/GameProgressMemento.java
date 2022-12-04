package com.lyh.memento.whitbox;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/1 2:03
 */
public class GameProgressMemento {

    private Integer roleLevel;

    private Integer currency;

    private String progress;


    public GameProgressMemento(Integer roleLevel, Integer currency, String progress) {
        this.roleLevel = roleLevel;
        this.currency = currency;
        this.progress = progress;
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public Integer getCurrency() {
        return currency;
    }

    public String getProgress() {
        return progress;
    }


}
