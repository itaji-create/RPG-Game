package com.rpg.demo;

import java.util.Random;

import com.rpg.demo.archetypes.Archetype;
import com.rpg.demo.fighter.Fighter;
import com.rpg.demo.fighter.SimpleFighter;
import com.rpg.demo.races.Race;

public class Character implements Fighter {
	private String name;
	private int maxLifePoints;
	private int lifePoints;
	private int strength;
	private int defense;
	private int dexterity;
	private Energy energy;
	private Archetype archetype;
	private Race race;

	Random gerador = new Random();

	Character(String name, Archetype archetype, Race race) {
		this.name = name;
		this.archetype = archetype;
		this.race = race;
		this.maxLifePoints = 100;
		this.lifePoints = this.maxLifePoints;
		this.strength = gerador.nextInt(10) + 1;
		this.defense = gerador.nextInt(10) + 1;
		this.dexterity = 100;
		this.energy = new Energy(archetype.getEnergyType(), gerador.nextInt(10) + 1);
	}
	
	public Character(String name) {
    }

	public Archetype getArchetype() {
        return archetype;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getDexterity() {
        return dexterity;
    }

    public Energy getEnergy() {
        return new Energy(energy.getType(), energy.getAmount());
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void attack(SimpleFighter enemy) {
	    enemy.receiveDamage(this.strength + gerador.nextInt(10) + 1);
	}

	@Override
	public int receiveDamage(int attackPoints) {
	    int damage = this.defense - attackPoints;
	    if (damage < 1) {
	        this.lifePoints += damage;
	    }
	    if (this.lifePoints == 0 || this.lifePoints < 1) {
	        this.lifePoints = -1;
	    }
	    return this.lifePoints;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}
	
}
