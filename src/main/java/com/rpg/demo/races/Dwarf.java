package com.rpg.demo.races;

public class Dwarf extends Race {
    private int maxLifePoints;
    private static int instanceCount = 0;

    public Dwarf(int dexterity) {
        super(dexterity);
        this.maxLifePoints = 80;
        instanceCount++;
    }

    @Override
    public int getMaxLifePoints() {
        return maxLifePoints;
    }

    public static int createdRacesInstances() {
        return instanceCount;
    }
}