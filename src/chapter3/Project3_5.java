package chapter3;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 */
public class Project3_5 {

	static String[] workdays = {"Monday", "Tuesday", "Wednseday", "Thursday", "Friday"};
	
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
	
	/**
	 * Gets all of the elements in an Integer array and adds them
	 * @param array
	 * @return Sum
	 */
	static int arraySum(int[] array){
		int total = 0;
		for(int n: array){
			total += n;
		}
		return total;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double wage;
		int hoursTotal, overtimeTotal;
		int[] hours = new int[5];
		int[] overtime = new int[5];
		
		System.out.print("Hourly Wage: $");
		wage = in.nextDouble();
		for(int i = 0; i < workdays.length; i++){
			System.out.print("Hours worked (w/o overtime) on " + workdays[i] + ": ");
			hours[i] = in.nextInt();
			System.out.print("Overtime hours worked on " + workdays[i] + ": ");
			overtime[i] = in.nextInt();
		}
		
		hoursTotal = arraySum(hours);
		overtimeTotal = arraySum(overtime);
		
		System.out.printf("The pay for this week is $%.2f", calculateWeek(wage, hoursTotal, overtimeTotal));
		
		in.close();
	}
	
}
