package com.jacksai.cosher.model;


public class Receipt {
    private Person payer;
    private NightOut nightOut;

    public Receipt(Person payer, NightOut nightOut) {
        this.payer = payer;
        this.nightOut = nightOut;
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
}
