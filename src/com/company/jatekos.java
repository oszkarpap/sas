package com.company;

public abstract class jatekos {

    private double money;


    //kötelező felüldefiniálni

    public abstract void lep();

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
