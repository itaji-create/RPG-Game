package com.rpg.demo.archetypes;

import com.rpg.demo.EnergyType;

public class Warrior extends Archetype {
	private EnergyType energyType = EnergyType.MANA;

    public Warrior() {
        super();
        this.energyType = EnergyType.STAMINA;
    }
    
    @Override
    public EnergyType getEnergyType() {
        return energyType;
    }
}
