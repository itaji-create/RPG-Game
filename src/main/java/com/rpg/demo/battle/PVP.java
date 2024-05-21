package com.rpg.demo.battle;

import com.rpg.demo.fighter.Fighter;

public class PVP extends Battle {
    private Fighter player2;

    public PVP(Fighter char1, Fighter char2) {
        super(char1);
        this.player2 = char2;
    }

    @Override
    public int fight() {
        while (this.player.getLifePoints() > 0 && this.player2.getLifePoints() > 0) {
            this.player2.attack(this.player);
            this.player.attack(this.player2);
            this.player.attack(this.player2);
            this.player2.attack(this.player);
            
            System.out.println("Player 1 ");
    		System.out.println("Player1 - Defesa ---  " + player.getDefense());
    		System.out.println("Player 1 - Força ---  " + player.getStrength());
    		System.out.println("Pontos de Vida ---  " + player.getLifePoints());
    		
    		System.out.println("Player 2");
    		System.out.println("Player2 - Defesa ---  " + player2.getDefense());
    		System.out.println("Player 2 - Força ---  " + player2.getStrength());
    		System.out.println("Pontos de Vida ---  " + player2.getLifePoints());
        }
        return super.fight();
    }
}