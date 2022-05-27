package com.nttdata.javat1.game;

public class Game {
	
	private int Score;
	private String Player;
	
	
	//Constructor
	public Game() {
		
	}
	
	public Game(int Score , String Player ) {
		this.Score = Score;
		this.Player = Player;
	}

	
	//Method
	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getPlayer() {
		return Player;
	}

	public void setPlayer(String player) {
		Player = player;
	}

	
	
	
	
	
}
