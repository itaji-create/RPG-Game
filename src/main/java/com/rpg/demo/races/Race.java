package com.rpg.demo.races;

public abstract class Race {
    private int dexterity;

    public Race(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterity() {
        return dexterity;
    }

    public static int createdRacesInstances() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract int getMaxLifePoints();
}
