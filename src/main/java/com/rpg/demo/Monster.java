package com.rpg.demo;

import com.rpg.demo.fighter.SimpleFighter;

public class Monster implements SimpleFighter {
    protected int lifePoints;
    private int strength;

    public Monster() {
        this.lifePoints = 85;
        this.strength = 63;
    }

    @Override
    public void attack(SimpleFighter enemy) {
        enemy.receiveDamage(this.strength);
    }

    @Override
    public int receiveDamage(int attackPoints) {
        this.lifePoints -= attackPoints;

        if (this.lifePoints == 0 || this.lifePoints < 1) {
            this.lifePoints = -1;
        }
        return this.lifePoints;
    }

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }


}
