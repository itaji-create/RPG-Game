package com.rpg.demo.races;

public class Elf extends Race {
    private int maxLifePoints;
    private static int instanceCount;

    public Elf(int dexterity) {
        super(dexterity);
        this.maxLifePoints = 99;
    }

    public int getMaxLifePoints() {
        return maxLifePoints;
    }

    public static int createdRacesInstances() {
        if (instanceCount == 0) {
            instanceCount = 0;
        }
        instanceCount++;
        return instanceCount;
    }
}
