package com.lyh.memento.whitbox;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/1 1:53
 */
public class GameProgress {


    private Integer roleLevel;

    private Integer currency;

    private String progress;


    public GameProgress(Integer roleLevel, Integer currency, String progress) {
        this.roleLevel = roleLevel;
        this.currency = currency;
        this.progress = progress;
    }

    public GameProgress() {
    }

    public GameProgressMemento saveGameProgress(){
        return new GameProgressMemento(roleLevel,currency,progress);
    }

    public void readGameProgressMemento(GameProgressMemento memento){
        this.roleLevel = memento.getRoleLevel();
        this.currency = memento.getCurrency();
        this.progress = memento.getProgress();
        System.out.println("读档完成");
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "roleLevel=" + roleLevel +
                ", currency=" + currency +
                ", progress='" + progress + '\'' +
                '}';
    }
}
