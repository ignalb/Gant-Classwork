package chapter7;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_1 {
	
	public static int random(int max){
		return random(1, max);
	}
	public static int random(int min, int max){
		if(min > max){
			int temp = max;
			min = max;
			max = temp;
		}
		return (int)(Math.round(Math.random()*(max-1))+min);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int guessNumber = 0;
		int randomNumber = random(1, 100);
		int guesses = 0;	//Number of guesses
		
		while(guessNumber != randomNumber){
			System.out.print("Guess: ");
			guessNumber = in.nextInt();
			guesses++;
			if(guessNumber >= 1 && guessNumber <= 100){
				if(guessNumber == randomNumber){
					
				} else if(guessNumber > randomNumber) {
					System.out.println("The number is LESS");
				} else {
					System.out.println("The number is MORE");
				}
			} else {
				System.out.println("Number must be between 1 and 100");
			}
		}
		System.out.printf("Random number %d guessed in %d attempt(s).\n", randomNumber, guesses);
		in.close();
	}
	
}
