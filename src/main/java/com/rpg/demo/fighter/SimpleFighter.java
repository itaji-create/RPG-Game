package com.rpg.demo.fighter;

public interface SimpleFighter {
	int getLifePoints();
    int getStrength();
    void attack(SimpleFighter enemy);
    int receiveDamage(int attackPoints);
}
