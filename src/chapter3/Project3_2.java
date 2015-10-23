package chapter3;

import java.util.Scanner;

/**
 * @author Ignacio Pacheco
 */
public class Project3_2 {

	static double diameter(double r){
		return 2 * r;
	}
	static double circumference(double r){
		return 2 * Math.PI * r;
	}
	static double surfaceArea(double r){
		return 4 * Math.PI * Math.pow(r, 2);
	}
	static double volume(double r){
		return 4 / 3 * Math.PI * Math.pow(r, 3);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius = in.nextDouble();
		
		System.out.println("Diameter: \t" + diameter(radius));
		System.out.println("Circumference:\t" + circumference(radius));
		System.out.println("Surface Area:\t" + surfaceArea(radius));
		System.out.println("Volume: \t" + volume(radius));
		
		in.close();
	}

}
