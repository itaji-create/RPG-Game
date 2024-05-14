package com.rpg.demo.archetypes;

import com.rpg.demo.EnergyType;

public class Necromancer extends Archetype {
	private EnergyType energyType = EnergyType.MANA;

    public Necromancer() {
        super();
        this.energyType = EnergyType.MANA;
    }
    
    @Override
    public EnergyType getEnergyType() {
        return energyType;
    }
}
