package chapter07;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_05 {

	static int euclideanAlgorithm(int n1, int n2){
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		if(n1 == 0) {
			return n2;
		} else {
			if(n1 > n2) {	// Makes n2 the largest of the two numbers
				int n0 = n1;
				n1 = n2;
				n2 = n0;
			}
			System.out.println("Computing Remainder...");
			int r = n2 % n1;
			System.out.println("Remainder = " + r);
			System.out.println("Running Algorithm Again");
			return euclideanAlgorithm(r, n1);
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a, b;
		
		System.out.print("Enter first number: ");
		a = in.nextInt();
		System.out.print("Enter second number: ");
		b = in.nextInt();
		
		System.out.println("GCD of " + a + " and " + b + ": ");
		System.out.println(euclideanAlgorithm(a, b));
		
		in.close();
	}
	
}
