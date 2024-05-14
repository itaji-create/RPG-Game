package com.rpg.demo.archetypes;

import com.rpg.demo.EnergyType;

public class Mage extends Archetype {
    private EnergyType energyType = EnergyType.MANA;

    public Mage() {
        super();
        this.energyType = EnergyType.MANA;
    }
    
    @Override
    public EnergyType getEnergyType() {
        return energyType;
    }
}
