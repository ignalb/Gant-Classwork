package chapter4;

import java.util.Scanner;

public class Project4_10 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double salary, rate;
		int years;
		
		System.out.print("Starting salary: $");
		salary = in.nextDouble();
		System.out.print("Yearly Percent Increase (in decimal form): ");
		rate = in.nextDouble();
		System.out.print("Number of Years: ");
		years = in.nextInt();
		
		for(int i = 0; i < years; i++){
			double increase;
			if(i < 10){
				increase = salary*rate*i;
			} else {
				increase = 0;
			}
			System.out.printf("Year %-3d | $%.2f\n", i+1, salary + increase);
		}
		in.close();
	}
	
}
