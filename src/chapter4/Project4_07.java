package chapter4;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_07 {

	/**
	 * Returns 2^n
	 * @param n
	 * @return
	 */
	private static long pow2(int n){
		return (long) Math.pow(2, n);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int exp = 0;
		
		while(true){
			System.out.print("Nth power of 2: ");
			exp = in.nextInt();
			if(exp == -1){
				break;
			}
			System.out.printf("2^%d = %d\n", exp, pow2(exp));
		}
		in.close();
	}
	
}
