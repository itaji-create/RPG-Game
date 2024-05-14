package com.rpg.demo.archetypes;

import com.rpg.demo.EnergyType;

public class Ranger extends Archetype {
	private EnergyType energyType = EnergyType.MANA;

    public Ranger() {
        super();
        this.energyType = EnergyType.STAMINA;
    }
    
    @Override
    public EnergyType getEnergyType() {
        return energyType;
    }
}
