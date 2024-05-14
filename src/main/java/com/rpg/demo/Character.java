package com.rpg.demo;

import java.util.Random;

import com.rpg.demo.archetypes.Archetype;
import com.rpg.demo.archetypes.Mage;
import com.rpg.demo.fighter.Fighter;

public class Character implements Fighter {
	private String name;
	private int maxLifePoints;
	private int lifePoints;
	private int strength;
	private int defense;
	private int dexterity;
	private Energy energy;
	private Archetype archetype;

	Random gerador = new Random();

	Character(String name, Archetype archetype) {
		this.setName(name);
		this.archetype = archetype;
		this.maxLifePoints = 100;
		this.lifePoints = this.maxLifePoints;
		this.strength = gerador.nextInt(10) + 1;
		this.defense = gerador.nextInt(10) + 1;
		this.dexterity = 100;
		this.energy = new Energy(archetype.getEnergyType(), gerador.nextInt(10) + 1);
	}
	
	public Character(String name) {
        this(name, new Mage());
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
	
}
