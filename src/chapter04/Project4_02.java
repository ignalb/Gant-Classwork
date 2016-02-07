package chapter04;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_02 {
	
	public static void main(String[] args){
		double a, b, c;	// a^2 + b^2 = c^2 // Proof of right triangle
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the length of the first side: ");
		a = in.nextDouble();
		System.out.print("Enter the length of the second side: ");
		b = in.nextDouble();
		System.out.print("Enter the length of the third side: ");
		c = in.nextDouble();
		
		System.out.println("isRightTriangle: " + isRightTriangle(a, b, c));
		
		in.close();
	}

	private static boolean isRightTriangle(double a, double b, double c) {
		double n;
		if(a > b && a > c){
			n = c;
			c = a;
			a = n;
		}
		if(b > a && b > c){
			n = c;
			c = b;
			b = n;
		}
		
		if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
			return true;
		} else {
			return false;
		}
	}
	
}
