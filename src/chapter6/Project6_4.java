package chapter6;

import java.util.Random;

public class Project6_4 {

	public static void main(String[] args){
		Dice dice1 = new Dice(), dice2 = new Dice();
		
		for(int i = 0; i < 10; i++){
			int d1 = dice1.getValue();
			int d2 = dice2.getValue();
			System.out.println("Dice1: " + d1 + "\tDice2: " + d2 + "\tSum: " + (d1+d2));
			dice1.roll();
			dice2.roll();
		}
	}
}

class Dice {
	private Random rand = new Random();
	private int face;
	
	public Dice(){
		roll();
	}
	
	public void roll(){
		face = rand.nextInt(6) + 1;
	}
	public int getValue(){
		return face;
	}
}