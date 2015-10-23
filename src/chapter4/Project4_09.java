package chapter4;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project4_09 {

	/**
	 * Returns a^n
	 * @param a
	 * @param n
	 * @return
	 */
	private static long pow(int a, int n){
		return (long) Math.pow(a, n);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src/chapter4/numbers.txt"));
		int base = 0;
		int exp = 0;
		
		while(in.hasNext()){
			base = in.nextInt();
			exp = in.nextInt();
			
			System.out.printf("%d^%d = %d\n", base, exp, pow(base, exp));
		}
		in.close();
	}
	
}
