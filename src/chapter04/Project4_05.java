package chapter04;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_05 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int iterations;
		double result = 0;
		
		System.out.print("Enter the number of iterations: ");
		iterations = in.nextInt();
		
		
		for(int i = 1; i <= iterations; i++){
			double fraction = 1/(2 * (double)i - 1);
			if(i%2 == 0){
				result -= fraction;
			} else {
				result += fraction;
			}
			
		}
		
		System.out.println("π/4 ≈ " + result);
		System.out.println("π ≈ " + result * 4);
		
		in.close();
	}
	
}
