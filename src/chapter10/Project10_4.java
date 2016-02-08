package chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Project10_4 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer[] nums = new Integer[10];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		System.out.println("Median of { " + Util.arrayToString(nums) + " } = " + getMedian(nums));
		
		in.close();
	}
	
	public static <T extends Number> double getMedian(T[] arr)
	{
	    Arrays.sort(arr);
	    return ((arr.length % 2 == 0) ? (arr[arr.length/2-1].doubleValue() + arr[arr.length/2].doubleValue())/2
	    		: arr[(arr.length-1)/2].doubleValue());
	}

}
