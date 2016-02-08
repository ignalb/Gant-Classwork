package chapter10;

import java.util.Scanner;

public class Project10_1 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] evenList = new int[0], oddList = new int[0], negativeList = new int[0];
		
		System.out.println("Enter 10 Numbers:");
		for(int i = 0; i < 10; i++){
			int x = in.nextInt();
			if(x < 0)
				negativeList = addIntElement(negativeList, x);
			if(x % 2 == 0)
				evenList = addIntElement(evenList, x);
			else
				oddList = addIntElement(oddList, x);
		}
		
		System.out.print("\nevenList : ");
		for(int x : evenList){
			System.out.print(x + " ");
		}
		System.out.print("\noddList : ");
		for(int x : oddList){
			System.out.print(x + " ");
		}
		System.out.print("\nnegativeList : ");
		for(int x : negativeList){
			System.out.print(x + " ");
		}
		
		in.close();
	}
	
	public static int[] addIntElement(int[] list, int x){
		int[] array = new int[list.length+1];
		for(int i = 0; i < list.length; i++){
			array[i] = list[i];
		}
		array[list.length] = x;
		return array;
	}
	
}
