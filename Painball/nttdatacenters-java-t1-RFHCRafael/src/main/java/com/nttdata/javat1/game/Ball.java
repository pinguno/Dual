package com.nttdata.javat1.game;

public class Ball {

	private int Attempts;
	
	//Constructor
	public Ball() {
		
	}	
	
	public Ball(int Attempts){
		this.Attempts = Attempts;
	
	}

	//Methods
	public int getAttempts() {
		return Attempts;
	}


	public void setAttempts(int attempts) {
		Attempts = attempts;
	}
	
	
	
	
}
