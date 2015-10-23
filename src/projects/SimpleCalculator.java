package projects;

import java.util.Scanner;

public class SimpleCalculator {
	private static Scanner in = new Scanner(System.in);
	
	static void multiply(double num1, double num2){
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	static void divide(double num1, double num2){
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
	static void add(double num1, double num2){
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	static void subtract(double num1, double num2){
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	static void printHeader(){
		System.out.print("*****************************\n"
						+"*     SIMPLE CALCULATOR     *\n"
						+"*****************************\n");
	}
	static void printOptions(){
		System.out.print( "***********\n"
						+ "* OPTIONS *\n"
						+ "***********\n"
						+ "1) Add\n"
						+ "2) Subtract\n"
						+ "3) Multiply\n"
						+ "4) Divide\n"
						+ "***********\n"
						+ "Enter an option or '0' to quit: ");
	}
	
	public static void main(String[] args) {
		int choice = 0;
		double num1 = 0, num2 = 0;
		
		printHeader();
		do{
			printOptions();
			choice = in.nextInt();
			if(choice >= 1 && choice <= 4){
				System.out.print("First number: ");
				num1 = in.nextDouble();
				System.out.print("Second number: ");
				num2 = in.nextDouble();
			}
			
			switch(choice){
			case 1:
				add(num1, num2);
				break;
			case 2:
				subtract(num1, num2);
				break;
			case 3:
				multiply(num1, num2);
				break;
			case 4:
				divide(num1, num2);
				break;
			}
			System.out.println("------------------------------------");
		}while(choice != 0);
	}

}
