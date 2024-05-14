package com.rpg.demo.fighter;

import com.rpg.demo.Energy;

public interface Fighter extends SimpleFighter {
    int getDefense();
    Energy getEnergy();
}
