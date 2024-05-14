package com.rpg.demo;

public class Energy {
    private EnergyType type;
    private int amount;

    public Energy(EnergyType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public EnergyType getType() {
        return type;
    }

    public void setType(EnergyType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}