package com.rpg.demo.battle;

import com.rpg.demo.fighter.Fighter;

abstract class Battle {
  protected Fighter player;

  public Battle(Fighter player) {
    this.player = player;
  }

  public int fight() {
    return this.player.getLifePoints() == -1 ? -1 : 1;
  }
}