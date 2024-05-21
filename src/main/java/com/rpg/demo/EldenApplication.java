package com.rpg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rpg.demo.archetypes.Mage;
import com.rpg.demo.archetypes.Warrior;
import com.rpg.demo.battle.PVP;
import com.rpg.demo.races.Elf;

@SpringBootApplication
public class EldenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldenApplication.class, args);
		
		Mage mage = new Mage();
		Warrior warrior = new Warrior();
		
		Elf elf = new Elf(100);
		
		Character player1 = new Character("Baldo", mage, elf);
		Character player2 = new Character("Wildo", warrior, elf);
	;
		PVP pvp = new PVP(player1, player2);
		
        System.out.println("Player 1 --- " + pvp.fight());
		
	}

}
