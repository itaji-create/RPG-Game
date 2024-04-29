package com.rpg.demo.fighter;

public interface Fighter {
	public int defense = 0;
	public int lifePoints = 0;
	public int strength = 0;
	void attack(Fighter enemy);
	int receiveDamage(int attackPoints);
}
