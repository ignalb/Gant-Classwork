package chapter10;

import java.util.Scanner;

public class Project10_2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double[] nums = new double[10];
		double avg;
		
		System.out.println("Enter 10 numbers:");
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextDouble();
		}
		
		avg = avgFromArray(nums);
		System.out.println("Average: " + avg);
		System.out.print("Greater nums: ");
		for(double x : nums){
			if(x > avg)
				System.out.print(x + " ");
		}
		
		in.close();
	}
	
	public static double avgFromArray(double[] nums){
		double total = 0;
		for(double num : nums){
			total += num;
		}
		return total / nums.length;
	}
}
