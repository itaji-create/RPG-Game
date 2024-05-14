package com.rpg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rpg.demo.archetypes.Mage;
import com.rpg.demo.archetypes.Warrior;

@SpringBootApplication
public class EldenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldenApplication.class, args);
		
		Mage mage = new Mage();
		Warrior warrior = new Warrior();
		
		Character player1 = new Character("Baldo", mage);
		Character player2 = new Character("Wildo", warrior);
		
		
		System.out.println("Player 1" + player1.getName());
		System.out.print("Player2 - Defesa" + player2.getDefense());
		System.out.println("Player 1 - Força " + player1.getStrength());
		System.out.println("Pontos de Vida " + player1.getLifePoints());
		System.out.println("Pontos de Vida " + player1.getArchetype());
		
		System.out.println("Player 2" + player2.getName());
		System.out.print("Player2 - Defesa" + player2.getDefense());
		System.out.println("Player 2 - Força " + player2.getStrength());
		System.out.println("Pontos de Vida " + player2.getLifePoints());
		System.out.println("Pontos de Vida " + player2.getArchetype());
	}

}
