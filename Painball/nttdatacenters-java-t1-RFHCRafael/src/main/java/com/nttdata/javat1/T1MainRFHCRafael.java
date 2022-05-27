package com.nttdata.javat1;
import com.nttdata.javat1.game.Ball;
import com.nttdata.javat1.game.Game;
import java.util.*;


/**
 * 
 * @author RFHCRafael
 *
 */

public class T1MainRFHCRafael {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//Variables
		int Attempts;
		int Option = 0;
		boolean ok = false;
		
		
		
		//Main
		

		System.out.println("############################################");
		System.out.println("Welcome to Royal_Pinball");
		System.out.println("############################################");
		
		
		Option = Menu_main();
			switch(Option) {
			case 1 :
				System.out.println("LETS PLAY!!!!!!!!!!!!!");
				System.out.println("──────────────▄▀█▀█▀▄\r\n"
								 + "─────────────▀▀▀▀▀▀▀▀▀ \r\n"
								 + "─────────────▄─░░░░░▄\r\n"
								 + "───█──▄─▄───▐▌▌░░░░░▌▌\r\n"
								 + "▌▄█▐▌▐█▐▐▌█▌█▌█░░░░░▌▌\r\n"
								 + "");
				launchAndStart();	

				break;
				
			case 2 :
				System.out.println("THX for play with us ::|::");
				
				break;
			
			}
			
			
		
		
	}
	
	/**
	 * Metodo con las opciones del main
	 * 
	 * @return
	 */
	public static int Menu_main() {
		int Option = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.- PLAY!!!!!!!!");
		System.out.println("2.- EXIT:(");
		Option = sc.nextInt();
		
		
		
		return Option;
		
		
	}
	
	/**
	 * Metodo que seria Pinball en si
	 * 
	 */
	public static void  launchAndStart() {
		Scanner sc = new Scanner(System.in);
		
		Ball b1 = new Ball();
		Game g1 = new Game();
		Game g2 = new Game();
		
		//Variables
		int Lucky = Random(0,100);
		boolean ok = false ;
		String Nick;
		int Option;
		int balls;
		int Scoore;
		
		
		System.out.println("Please tell me you name");
		Nick = sc.nextLine();
		g1.setPlayer(Nick);
		System.out.println("How many Balls you want???");
		balls = sc.nextInt();
		b1.setAttempts(balls);
		
		System.out.println("############################################");
		
		do {
			
			System.out.println("YOUR NUMBER OF BALLS IS : "+ balls);
			System.out.println("1-THROW BALL SLOWLY    <:3)~~~~");
			System.out.println("2-THROW BALL FAST   //\\(oo)/\\");
			System.out.println("3-SEE YOUR SCOORE         [($)]");
			System.out.println("4-Exit");
			Option = sc.nextInt();
			ok = CheckBalls(balls);
			if(ok == false ) {
				
				
				switch(Option) {
					case 1:
						balls -= 1;
						System.out.println("─▄▀▀▀▄────▄▀█▀▀█▄\r\n"
								         + "▄▀─▀─▀▄▄▀█▄▀─▄▀─▄▀▄\r\n"
								         + "█▄▀█───█─█▄▄▀─▄▀─▄▀▄\r\n"
								         + "──█▄▄▀▀█▄─▀▀▀▀▀▀▀─▄█\r\n"
								         + "─────▄████▀▀▀▀████─▀▄\r\n"
								      + "");
						
						g1.setScore(Game_slow(g1.getScore()));
						Scoore = g1.getScore();
						System.err.println(Scoore); 
						break;
					case 2:
						balls -= 1;
						System.out.println("──▄█▀█▄─────────██\r\n"
								         + "▄████████▄───▄▀█▄▄▄▄\r\n"
							        	 + "██▀▼▼▼▼▼─▄▀──█▄▄\r\n"
							         	 + "█████▄▲▲▲─▄▄▄▀───▀▄\r\n"
							     	     + "██████▀▀▀▀─▀────────▀▀\r\n"
							 	         + "");
						g2.setScore(Game_fast(g2.getScore()));
						
						System.err.println(g2.getScore()); 
						break;
					case 3:
						
						System.out.println("─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\r\n"
								         + "█░░░█░░░░░░░░░░▄▄░██░█\r\n"
				 				         + "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█\r\n"
								         + "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█\r\n"
							             + "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀\r\n"
								          + "");
						Scoore = g1.getScore() + g2.getScore();
						System.err.println(Scoore); 
						break;
					
				
				
				
				}
				
			}else {
				System.out.println("Sorry you dont have more balls BYEEEE!!!!!!");
				break;
				
			}
			
		
		}while(Option != 4);
		Scoore = g1.getScore() + g2.getScore();
		
			System.out.println("Your Scoore "+ g1.getPlayer() +" is:" + Scoore);
		
		if(Lucky < 25) {
				Last_chance(Scoore,g1.getPlayer());
		}
	
			
		
		
	}
	
	/**
	 * Este metodo es para una bola lenta en el cual hay agujeros de poco valor pero una alta posibilidad
	 * de repetir varias veces
	 * @param Scoore
	 * @return
	 */
	public static int Game_slow(int Scoore) {
		int wholes;
		
		for(int i = 0 ; i < Random(0,500);i++) {
			wholes = Random(0,100);
			if(wholes >= 0 && wholes <= 9) {
				Scoore += 1000;
			}else if(wholes >= 10 && wholes <= 19){
				Scoore += 850;
			}else if(wholes >= 20 && wholes <= 29){
				Scoore += 650;
			}else if(wholes >= 30 && wholes <= 39){
				Scoore += 600;
			}else if(wholes >= 40 && wholes <= 49){
				Scoore += 500;
			}else if(wholes >= 50 && wholes <= 59){
				Scoore += 400;
			}else if(wholes >= 60 && wholes <= 69){
				Scoore += 350;
			}else if(wholes >= 70 && wholes <= 79){
				Scoore += 300;
			}else if(wholes >= 80 && wholes <= 89){
				Scoore += 150;
			}else if(wholes >= 90 && wholes <= 100){
				Scoore += 200;
			}
			
			
		}
		
		
		return Scoore;
		
	}
	
	/**
	 * Este metodo es para la bola rapida menos agujeros pero mas puntuacion
	 * 
	 * @param Scoore
	 * @return
	 */
	public static int Game_fast(int Scoore) {
		int wholes;
		
		for(int i = 0 ; i < Random(0,25);i++) {
			wholes = Random(0,100);
			if(wholes >= 0 && wholes <= 24) {
				Scoore += 10000;
			}else if(wholes >= 25 && wholes <= 49){
				Scoore += 8500;
			}else if(wholes >= 50 && wholes <= 74){
				Scoore += 6500;
			}else if(wholes >= 75 && wholes <= 100){
				Scoore += 6000;
			}
			
		}
		
		

		return Scoore;
		
	}
	
	/**
	 * Metodo para numero random
	 * @param min
	 * @param max
	 * @return
	 */
	public static int Random(int min, int max) {
		int Random = (int) Math.floor((max - min + 1) * Math.random() + min);
		return Random;
	}
	
	/**
	 * Metodo para comproba cuantas bolas te quedan
	 * @param balls
	 * @return
	 */
	public static boolean CheckBalls (int balls) {
		boolean ok = false;
		
		if(balls == 0) {
			ok = true;
		}
		
		return ok;
		
	}
	
	/**
	 * Ultima oportunidad para lanzar la bola. Tienes un 25% de probabilidad que te toque.
	 * 
	 * @param Scoore
	 * @param Name
	 */
	public static void Last_chance(int Scoore , String Name) {
		Scanner sc = new Scanner(System.in);
		
		int Option = 0;
		int Scoore_last;
		
		
		System.out.println("############################################");
		System.out.println("Okey this is your last oportunity");
		System.out.println("You want to play???");
		System.out.println("1.- YES");
		System.out.println("2.- NO");
		Option = sc.nextInt();
		
			switch(Option) {
				case 1:
					System.out.println("Lets goooo !!!! ");
					Scoore_last = Last_chance_game(Scoore);
					
					System.out.println("GOOD JOB " + Name + " You have " + Scoore_last + " Points");
					break;
				case 2:
					System.out.println("Thx for play with us!!!!!");
					break;
				
			}
		
		
		
		
		
		
	}
	
	/**
	 * Juego de la ultima oportunidad
	 * 
	 * @param Scoore
	 * @return
	 */
	public static int Last_chance_game(int Scoore) {
		Scanner sc = new Scanner(System.in);
		
		int Option = 0;
		int Wholes = Random(0,10);
		
		
		do {
			System.out.println("Press 1 to throw the ball");
			Option = sc.nextInt();
		
		}while(Option != 1);
		
		System.out.println("############################################");
		System.out.println("The ball is in game");
		
		if(Wholes < 5) {
			Scoore *= 100;
			System.out.println("You got teh Bonus X100");
			
		}else if(Wholes >= 5){
			Scoore *= 20;
			System.out.println("You got teh Bonus X20");
		}
		
		
		return Scoore;
		
	}
	
}
