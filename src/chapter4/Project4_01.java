package chapter4;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_01 {
	
	public static void main(String[] args){
		int x, y, n;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		x = in.nextInt();
		System.out.print("Enter the second number: ");
		n = in.nextInt();
		if(n > x){
			y = x;
			x = n;
		} else {
			y = n;
		}
		
		System.out.println(x + " / " + y + " = " + x/y + " R" + x%y);
		
		in.close();
	}
	
}
