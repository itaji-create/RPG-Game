package com.rpg.demo.battle;

import java.util.List;

import com.rpg.demo.fighter.Fighter;
import com.rpg.demo.fighter.SimpleFighter;

public class PVE extends Battle {
    private List<SimpleFighter> environment;

    public PVE(Fighter player, List<SimpleFighter> monsters) {
        super(player);
        this.environment = monsters;
    }

    @Override
    public int fight() {
        for (SimpleFighter enemy : environment) {
            while (player.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
            	System.out.println("Player3 - Defesa ---  " + player.getDefense());
            	System.out.println("Player3 - Força ---  " + player.getStrength());
            	System.out.println("Pontos de Vida ---  " + player.getLifePoints());
            	System.out.println(" --- --- --- --- ---");
            	System.out.println(" --- --- --- --- ---");
            	enemy.attack(player);
                player.attack(enemy);
            }
        }
        return super.fight();
    }
}