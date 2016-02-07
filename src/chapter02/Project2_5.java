package chapter02;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project2_5 {
	
	private static Scanner in = new Scanner(System.in);
	
	/**
	 * p = m * v
	 * @param m Mass
	 * @param v Velocity
	 * @return Momentum
	 */
	private static double momentum(double m, double v){
		return m * v;
	}
	
	public static void main (String [] args){
		double mass, velocity;
		
		System.out.print("mass (kg): ");
		mass = in.nextDouble();
		System.out.print("velocity (m/s): ");
		velocity = in.nextDouble();
		
		System.out.println("momentum (kg m/s): " + momentum(mass, velocity));
	}
}
