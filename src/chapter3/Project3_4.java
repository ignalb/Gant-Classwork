package chapter3;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 */
public class Project3_4 {

	/**
	 * Calculates the Week's pay based on wage and all hours worked
	 * @param wage Hourly Wage
	 * @param hours Hours Worked <i><small>not including overtime</small></i>
	 * @param overtime Overtime hours worked
	 * @return Week's pay
	 */
	static double calculateWeek(double wage, int hours, int overtime){
		return wage * hours + 1.5 * wage * overtime;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double wage;
		int hours, overtime;
		
		System.out.print("Hourly Wage: $");
		wage = in.nextDouble();
		System.out.print("Hours worked (w/o overtime): ");
		hours = in.nextInt();
		System.out.print("Overtime hours worked: ");
		overtime = in.nextInt();
		
		System.out.printf("The pay for this week is $%.2f", calculateWeek(wage, hours, overtime));
		
		in.close();
	}
	
}
