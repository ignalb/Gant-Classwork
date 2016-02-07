package chapter04;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_06 {
	static Scanner in = new Scanner(System.in);
	
	/***
	 * Calculates exponential Population<br>
	 * final population = initial population * growth rate ^ (time / time to rate)
	 * @param init Initial population
	 * @param rate Rate of growth
	 * @param time Time in hours
	 * @param ct Completion time
	 * @return
	 */
	private static double calcPop(int init, double rate, double time, double ct){
		return init * Math.pow(rate, time/ct);
	}
	
	public static void main(String[] args){
		
		double growthRate, time, timeToRate;
		int population;
		
		System.out.print("Initial Population: ");
		population = (int) Math.abs(in.nextInt());
		System.out.print("Rate of Growth: ");
		growthRate = Math.abs(in.nextDouble());
		System.out.print("Time to achieve rate: ");
		timeToRate = Math.abs(in.nextDouble());
		System.out.print("Time elapsed in hours: ");
		time = Math.abs(in.nextDouble());
		
		population = (int) calcPop(population, growthRate, time, timeToRate);
		System.out.println("Population after " + time + " hrs: " + population);
		
	}
	
}
