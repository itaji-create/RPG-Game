package com.rpg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EldenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldenApplication.class, args);
		
		Character player1 = new Character("Baldo");
		Character player2 = new Character("Wildo");
		
		
		System.out.println("Player 1" + player1.getName());
		System.out.print("Player2 - Defesa" + player2.getDefense());
		System.out.println("Player 1 - Força " + player1.getStrength());
		System.out.println("Pontos de Vida " + player1.getLifePoints());
		
		System.out.println("Player 2" + player2.getName());
		System.out.print("Player2 - Defesa" + player2.getDefense());
		System.out.println("Player 2 - Força " + player2.getStrength());
		System.out.println("Pontos de Vida " + player2.getLifePoints());
		
		System.out.println("Ataques:");
		player1.attack(player2);
		player1.attack(player2);
		player1.attack(player2);
		
		System.out.println("Player 2" + player2.getName());
		System.out.println("Player 2 - Força " + player2.getStrength());
		System.out.println("Player2 - Defesa" + player2.getDefense());
		System.out.println("Pontos de Vida " + player2.getLifePoints());
		
		
	}

}
