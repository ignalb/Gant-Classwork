package chapter04;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_03 {

	public static void main(String[] args){
		double minutes;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the call duration in minutes: ");
		minutes = in.nextDouble();
		
		System.out.printf("Call Cost: $%.2f", calcCallCost(minutes));
		
		in.close();
	}

	private static double calcCallCost(double minutes) {
		if(minutes < 2){
			return 1.15;
		} else {
			return 1.15 + (Math.ceil(minutes)-2) * .5;
		}
	}
	
}
