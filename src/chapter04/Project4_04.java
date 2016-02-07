package chapter04;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number: ");
		long num = in.nextInt(), result = num;
		
		System.out.print(num + "! = " + num + " * ");
		for(long  i = num - 1; i > 0; i--){
			result *= i;
			System.out.print(i + " ");
			if(i != 1){
				System.out.print("* ");
			}
			
		}
		System.out.println("= " + result);
		in.close();
	}

}
