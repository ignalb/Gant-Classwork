package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project10_3 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer[] nums = new Integer[10], mode;
		
		System.out.println("Enter 10 Numbers:");
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		mode = getMode(nums).toArray(new Integer[0]);
		String modeS = Util.arrayToString(mode);
		System.out.print("Mode : " + modeS);
		
		in.close();
	}
	
	public static <T extends Number> List<T> getMode(T[] nums){
		Arrays.sort(nums);
		List<T> uNum = new ArrayList<T>();
		List<Integer> uNumR = new ArrayList<Integer>();
		Integer curR = 1, largestR = 0;
		T prev = null;
		
		for(int i = 0; i < nums.length; i++){
			if(prev == nums[i]){
				curR++;
			} else {
				if(i != 0)
					uNumR.add(curR);
				
				uNum.add(nums[i]);
				curR = 1;
				prev = nums[i];
			}
			if(curR > largestR)
					largestR = curR;
		}
		uNumR.add(curR);
		
		return Project10_5.getMode(uNum, uNumR);
	}
	
}
