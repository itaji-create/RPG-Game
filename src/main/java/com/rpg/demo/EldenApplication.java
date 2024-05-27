package com.rpg.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rpg.demo.archetypes.Mage;
import com.rpg.demo.archetypes.Warrior;
import com.rpg.demo.battle.PVE;
import com.rpg.demo.battle.PVP;
import com.rpg.demo.fighter.SimpleFighter;
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
		
        System.out.println("Battle PVP (player1 vs player2) Player 1 result =  " + pvp.fight());
        
		Character player3 = new Character("Wildo", warrior, elf);
    	System.out.println("Player3 - Defesa ---  " + player3.getDefense());
    	System.out.println("Player3 - Força ---  " + player3.getStrength());
    	System.out.println("Pontos de Vida ---  " + player3.getLifePoints());
    	System.out.println(" --- --- --- --- ---");
    	System.out.println(" --- --- --- --- ---");
    	player3.levelUp();
    	System.out.println("Player3 - Defesa ---  " + player3.getDefense());
    	System.out.println("Player3 - Força ---  " + player3.getStrength());
    	System.out.println("Pontos de Vida ---  " + player3.getLifePoints());
    	System.out.println(" --- --- --- --- ---");
    	System.out.println(" --- --- --- --- ---");
    	player3.levelUp();
    	System.out.println("Player3 - Defesa ---  " + player3.getDefense());
    	System.out.println("Player3 - Força ---  " + player3.getStrength());
    	System.out.println("Pontos de Vida ---  " + player3.getLifePoints());
    	System.out.println(" --- --- --- --- ---");
    	System.out.println(" --- --- --- --- ---");
    	player3.levelUp();
    	System.out.println("Player3 - Defesa ---  " + player3.getDefense());
    	System.out.println("Player3 - Força ---  " + player3.getStrength());
    	System.out.println("Pontos de Vida ---  " + player3.getLifePoints());
    	System.out.println(" --- --- --- --- ---");
    	System.out.println(" --- --- --- --- ---");
    	player3.levelUp();
    	player3.levelUp();
    	player3.levelUp();
    	player3.levelUp();
        Monster monster = new Monster();
        Dragon dragon = new Dragon();
        List<SimpleFighter> monsters = Arrays.asList(monster, monster);
        List<SimpleFighter> dragons = Arrays.asList(dragon);
        PVE pve = new PVE(player3, monsters);
        
        PVE pve2 = new PVE(player3, dragons);
        
        System.out.println("Player 3 vs monsters  result =  " + pve.fight());
        player3.levelUp();
        System.out.println("Player 3 vs dragon result =  " + pve2.fight());
		
	}

}
