package com.lyh.memento.blackbox;

/**
 * @description:
 * @author: yaheng
 * @date: 2022/12/1 1:53
 */
public class GameProgress {


    private Integer roleLevel;

    private Integer currency;

    private String progress;


    public GameProgress() {
    }

    public GameProgress(Integer roleLevel, Integer currency, String progress) {
        this.roleLevel = roleLevel;
        this.currency = currency;
        this.progress = progress;
    }


    public Memento saveGameProgress() {
        return new GameProgressMemento(roleLevel, currency, progress);
    }

    public void readMemento(Memento memento) {
        GameProgressMemento gameProgressMemento = (GameProgressMemento) memento;
        this.roleLevel = gameProgressMemento.getRoleLevel();
        this.currency = gameProgressMemento.getCurrency();
        this.progress = gameProgressMemento.getProgress();
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


    //使用内部类来实现黑箱模式
    private class GameProgressMemento implements Memento {

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

}
