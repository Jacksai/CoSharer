package com.jacksai.cosher.model;


public class Receipt {
    private Person payer;
    private NightOut nightOut;
    private Double cost;

    public Receipt(Person payer, NightOut nightOut, Double cost) {
        this.payer = payer;
        this.nightOut = nightOut;
        this.cost = cost;
    }

    public Person getPayer() {
        return payer;
    }

    public void setPayer(Person payer) {
        this.payer = payer;
    }

    public NightOut getNightOut() {
        return nightOut;
    }

    public void setNightOut(NightOut nightOut) {
        this.nightOut = nightOut;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
