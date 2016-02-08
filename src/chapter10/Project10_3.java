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
		
		mode = getMode(nums);
		String modeS = Util.arrayToString(mode);
		System.out.print("Mode : " + modeS);
		
		in.close();
	}
	
	public static Integer[] getMode(Integer[] nums){
		Arrays.sort(nums);
		List<Integer> uNum = new ArrayList<Integer>(), uNumR = new ArrayList<Integer>();
		List<Integer> indeces = new ArrayList<Integer>();
		Integer[] result;
		Integer curR = 1, largestR = 0;
		Integer prev = null;
		
		for(int i = 0; i < nums.length; i++){
			if(i == 0)
				prev = nums[0] - 1;
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
		
		for(int i = 0; i < uNumR.size(); i++){
			if(uNumR.get(i) == largestR)
				indeces.add(i);
		}
		
		result = new Integer[indeces.size()];
		for(int i = 0; i < result.length; i++){
			result[i] = uNum.get(indeces.get(i));
		}
		/*System.err.println("uNum    (" + uNum.size() + ") : " + Util.arrayToString(uNum.toArray()));
		System.err.println("uNumR   (" + uNumR.size() + ") : " + Util.arrayToString(uNumR.toArray()));
		System.err.println("indeces (" + indeces.size() + ") : " + Util.arrayToString(indeces.toArray()));*/
		return result;
	}
	
}
