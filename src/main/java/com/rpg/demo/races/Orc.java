package com.rpg.demo.races;

public class Orc extends Race {
    private int maxLifePoints;
    private static int instanceCount;

    public Orc(int dexterity) {
        super(dexterity);
        this.maxLifePoints = 74;
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
