// Converts kilometers to nautical miles
package chapter02;

import java.util.Scanner;

public class Project2_3 {
	
	static Scanner in = new Scanner(System.in);
	
	/**
	 * @param kilometers
	 * @return Nautical Miles
	 */
	private static double kmToNauMi(double kilometers){
		return 0.54 * kilometers;
	}
	
	public static void main (String [] args){
		double km;		//Stores kilometers
		
		System.out.print("Enter number of kilometers: ");
		km = in.nextDouble();
		System.out.println(km + " km = " + kmToNauMi(km) + " nmi");
	}
}
