package chapter7;

import java.util.Scanner;

public class Project7_2 {

	public static void printNum(int num){
		System.out.printf("Is the number %d? ", num);
	}
	
	public static int midPoint(int a, int b){
		return (int)((b - a) / 2 + a);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String response = "";
		int guessNum = Project7_1.random(1, 100);
		int lowest = 1, highest = 100;
		int guesses = 1;
		
		System.out.println("Think of a number between 1 and 100 (inclusive). "
				+ "I will attempt to guess that number.\n"
				+ "Respond by writing MORE if your number is greater than my guess.\n"
				+ "Respond with LESS if your number is smaller.\n"
				+ "Respond with CORRECT, EQUAL, or YES if my guess was correct.\n"
				+ "Good luck and DON'T YOU LIE TO ME.\n");
		printNum(guessNum);
		while(true){
			response = in.next().toUpperCase();
			if(response.equals("CORRECT") || response.equals("EQUAL") || response.equals("YES") || response.equals("TRUE")){
				break;
			}
			if(response.equals("MORE")){
				lowest = guessNum;
			} else if(response.equals("LESS")){
				highest = guessNum;
			}
			guessNum = midPoint(lowest, highest);
			printNum(guessNum);
			guesses++;
		}
		System.out.printf("Yay! And it only took me %d attempt(s)", guesses);
		in.close();
	}
	
}
