package chapter4;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_08 {

	/**
	 * Returns a^n
	 * @param a
	 * @param n
	 * @return
	 */
	private static long pow(int a, int n){
		return (long) Math.pow(a, n);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int base = 0;
		int exp = 0;
		
		while(true){
			do{
				System.out.print("Base (2 or greater): ");
				base = in.nextInt();
			}while(base < 2);
			exp = in.nextInt();
			
			if(exp == -1){
				break;
			}
			
			System.out.printf("%d^%d = %d\n", base, exp, pow(base, exp));
		}
		in.close();
	}
	
}
