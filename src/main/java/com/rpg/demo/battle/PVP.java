package com.rpg.demo.battle;

import com.rpg.demo.fighter.Fighter;

public class PVP extends Battle {
	private Fighter player2;
	
	PVP(Fighter char1, Fighter char2) {
		super(char1);
		this.player2 = char2;
	}
}
