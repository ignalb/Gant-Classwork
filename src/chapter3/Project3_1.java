package chapter3;

import java.util.Scanner;

/**
 * @author Ignacio Pacheco
 */
public class Project3_1 {

	static int calculateSA_Cube(int length){
		return 6 * length * length;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Length of cube: ");
		System.out.println("The Surface Area of the Cube is " + calculateSA_Cube(in.nextInt()));
		
		in.close();
	}
	
}
