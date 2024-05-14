package com.rpg.demo.archetypes;

import com.rpg.demo.EnergyType;

public abstract class Archetype {
    private int special;
    private int cost;

    public Archetype(int special, int cost) {
        this.special = special;
        this.cost = cost;
    }

    public Archetype() {
        this(0, 0);
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract EnergyType getEnergyType();

}