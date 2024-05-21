package com.rpg.demo.races;

public class Halfling extends Race {
    private int maxLifePoints;
    private static int instanceCount;

    public Halfling(int dexterity) {
        super(dexterity);
        this.maxLifePoints = 60;
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
