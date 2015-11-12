package chapter7;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_3 {
	
	static String numberToLetter(int number){
		if(number >= 60) {
			String letter;
			if(number >= 90) {
				number -= 90;
				letter = "A";
			} else if(number >= 80) {
				number -= 80;
				letter = "B";
			} else if(number >= 70) {
				number -= 70;
				letter = "C";
			} else {
				number -= 60;
				letter = "D";
			}
			if(number > 5){
				letter += "+";
			} else if(number < 2){
				letter += "-";
			}
			return letter;
		} else {
			return "F";
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numericGrade;
		
		System.out.print("Enter Numeric Grade: ");
		numericGrade = in.nextInt();
		while(numericGrade < 0 || numericGrade > 100){
			System.out.print("Enter a number within the range of 0 and 100: ");
			numericGrade = in.nextInt();
		}
		System.out.println(numericGrade + " = " + numberToLetter(numericGrade));
		
		in.close();
	}
	
}
