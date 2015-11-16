package chapter7;

import java.util.Random;
import java.util.Scanner;

public class Project7_06 {
	final static int ITERATIONS = 100;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int cash, totalRolls = 0;
		int die1, die2;
		
		System.out.print("How many dollars do you have? ");
		cash = in.nextInt();
		for(int i = 0; i < ITERATIONS; i++){
			int money = cash;
			int rolls = 0;
			
			while(money > 0){
				rolls++;
				
				die1 = rand.nextInt(6) + 1;	//1-6
				die2 = rand.nextInt(6) + 1;
				
				money += (die1 + die2 == 7) ? 4 : -1;
			}
			totalRolls += rolls;
		}
		System.out.printf("The average of total rolls was %.2f\n", (double) totalRolls / ITERATIONS);
		in.close();
	}
	
}
