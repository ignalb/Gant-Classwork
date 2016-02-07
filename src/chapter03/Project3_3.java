package chapter03;

import java.util.Scanner;

/**
 * @author Ignacio Pacheco
 */
public class Project3_3 {
	
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
	/**
	 * Ke = 1/2 * m * v^2
	 * @param m Mass
	 * @param v Velocity
	 * @return Kinetic Energy
	 */
	private static double kineticEnergy(double m, double v){
		return m * Math.pow(v, 2) / 2;
	}
	
	public static void main (String [] args){
		double mass, velocity;
		
		System.out.print("mass (kg): ");
		mass = in.nextDouble();
		System.out.print("velocity (m/s): ");
		velocity = in.nextDouble();
		
		System.out.println("momentum (kg m/s):\t" + momentum(mass, velocity));
		System.out.println("kinetic energy (J):\t" + kineticEnergy(mass, velocity));
	}
}
