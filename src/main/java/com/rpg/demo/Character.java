package com.rpg.demo;

import java.util.Random;

import com.rpg.demo.fighter.Fighter;

public class Character implements Fighter {
	private String name;
	private int maxLifePoints;
	private int lifePoints;
	private int strength;
	private int defense;

	Random gerador = new Random();

	Character(String name) {
		this.name = name;
		this.maxLifePoints = 100;
		this.lifePoints = this.maxLifePoints;
		this.strength = gerador.nextInt(10) + 1;
		this.defense = gerador.nextInt(10) + 1;
	}
	
	public void attack(Fighter enemy) {
		enemy.receiveDamage(this.strength);
	}
	
	public int receiveDamage(int attackPoints) {
	    int damage = this.defense - attackPoints;
	    damage -= gerador.nextInt(10) + 1;
	    if (damage < 1) {
	      this.lifePoints += damage;
	    }
	    if (this.lifePoints == 0 || this.lifePoints < 1) this.lifePoints = -1;
	    return this.lifePoints;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxLifePoints() {
		return maxLifePoints;
	}

	public void setMaxLifePoints(int maxLifePoints) {
		this.maxLifePoints = maxLifePoints;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
