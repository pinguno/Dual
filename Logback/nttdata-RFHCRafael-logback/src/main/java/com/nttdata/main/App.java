package com.nttdata.main;

import java.util.Random;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 
 * 
 * @author Pinguno
 *
 */
public class App {

	
	private static Logger log = (Logger) LoggerFactory.getLogger(App.class);
	
	/**
	 * Comienzo del programa que simula un pequeño casino
	 * 
	 * @param args
	 */
    public static void main( String[] args ) {
    
	    for(int i = 0 ; i < 500 ; i++) {
	    
	    	//Variables
	    	int startMoney = 50;
	    	int number ;
	    	int numberWinner;
	    	int priceMultiplier = 0;
	    	int reward;
	    	
	    	//Start of program
	    	log.info("Start of execution");
	    	
	    	System.out.println("Good afternoon. Welcome to RoyalCas");
	    	System.out.println("···································");
	    	
	    	System.out.println("let's start throwing the ball");
	    	log.info("thrown ball");
	    	
	    	number = random(1,50);
	    	numberWinner = random(1,50); 
	    	
	    		log.warn("assigned numbers{},{}",number,numberWinner);
	    		
	    	System.out.println("turning.....");
	    	
	    	
	    	//here we decide by how much we will multiply the money
	    	if(number > 0 && number <= 9) {
	    		priceMultiplier = 1;
	    		log.warn("priceMultiplier = 1");
	    	}else if(number >= 10 && number <= 19){
	    		priceMultiplier = 2;
	    		log.warn("priceMultiplier = 2");
	    	}else if(number >= 20 && number <= 29) {
	    		priceMultiplier = 3;
	    		log.warn("priceMultiplier = 3");
	    	}else if(number >= 30 && number <= 39) {
	    		priceMultiplier = 4;
	    		log.warn("priceMultiplier = 4");
	    	}else if(number >= 40 && number <= 50) {
	    		priceMultiplier = 5;
	    		log.warn("priceMultiplier = 5");
	    	}
	    	
	    	log.info("End of priceMultiplier");
	    	
	    		log.warn("price multiplication");
	    		
	    	reward = startMoney * priceMultiplier;
	    	
	    	log.info("Reward is : {}",reward);
	    	
	    	log.info("winning number check");
	    	
	    	
	    	//here we check if the numbers match
	    	if(winningNumberCheck(number,numberWinner)) {
	    		
	    		log.warn("the numbers match");
	    		System.out.println("!!!YOU ARE THE WINNER");
	    		reward = reward * 2;
	    		System.out.println("YOU WINN :" + reward + "€");
	    		log.warn("Reward is {}", reward);
	    		
	    	}else {
	    		
	    		log.warn("the numbers do not match");
	    		System.out.println("!!!Sorry try another game");
	    		System.out.println("Your reward is : " + reward + "€");
	    		log.warn("Reward is {}", reward);
	    		
	    	}
	    	
	    	System.out.println("···································");
	    	System.out.println("Thx for play with us");
	    	
	    	log.info("End of execution");
	    		
	    		
	    	
	    		
	    }	
    	
    }
    
    /**
     * Metodo que nos sirve para darnos un numero random entre dos valores
     * 
     * @param min
     * @param max
     * @return
     */
    public static int random(int min,int max) {
		int num = 0;
		Random randomNum = new Random();
		num = randomNum.nextInt(max-min+1)+min;
		
		return num;
		
	}
    
    /**
     * Este metodo comparamos el numero asigando y el numero ganador y nos lo devuelve como un boolean
     * 
     * 
     * @param numSelected
     * @param numWinner
     * @return
     */
    
    public static boolean winningNumberCheck(int numSelected , int numWinner) {
    	boolean ok = false;
    	
    	if(numSelected == numWinner) {
    		ok = true;
    	}
    	
    	return ok;
    			
    }
    
    
    
}
