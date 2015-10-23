package chapter4;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_06 {

	/***
	 * Calculates exponential Population<br>
	 * final population = initial population * growth rate ^ time
	 * @param init Initial population
	 * @param rate Rate of growth
	 * @param time Time in hours
	 * @return
	 */
	private static double calcPop(int init, double rate, double time){
		return init * Math.pow(rate, time);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double growthRate, time;
		int population;
		
		System.out.print("Initial Population: ");
		population = in.nextInt();
		System.out.print("Rate of Growth: ");
		growthRate = in.nextDouble();
		System.out.print("Time in hours: ");
		time = in.nextDouble();
		
		population = (int) calcPop(population, growthRate, time);
		System.out.println("Population after " + time + "hrs: " + population);
		in.close();
	}
	
}
