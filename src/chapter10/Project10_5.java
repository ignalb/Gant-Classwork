package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project10_5 {

	final static int AMOUNT = 10;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer[] nums = new Integer[AMOUNT];
		List<Integer> uNum = new ArrayList<Integer>(), uNumF = new ArrayList<Integer>();
		Integer curF = 1;
		
		System.out.printf("Enter %d numbers:\n", AMOUNT);
		for(int i = 0; i < AMOUNT; i++){
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		
		Integer prev = null;
		for(int i = 0; i < nums.length; i++){
			if(prev == nums[i]){
				curF++;
			} else {
				if(i != 0)
					uNumF.add(curF);
				
				uNum.add(nums[i]);
				curF = 1;
				prev = nums[i];
			}
		}
		uNumF.add(curF);
		
		printF(uNum, uNumF);
		System.out.println("Median = " + Project10_4.getMedian(uNum.toArray(new Integer[0])));
		System.out.println("Mode   = " + Util.arrayToString(getMode(uNum, uNumF)));
		
		in.close();
	}
	
	public static <T extends Number> void printF(T[] uNums, Integer[] uNumF){
		printF(Arrays.asList(uNums), Arrays.asList(uNumF));
	}
	public static <T extends Number> void printF(List<T> uNums, List<Integer> uNumF){
		boolean[][] xGrid= new boolean[uNums.size()][uNumF.size()];
		int mostDigits = 0;
		
		for(int j = 0; j < uNums.size(); j++){
			for(int i = 1; i <= uNumF.size(); i++){
				if(uNumF.get(j) >= i)
					xGrid[j][xGrid[j].length - i] = true;
			}
		}
		
		for(T num : uNums){
			int digits = num.toString().length();
			if(digits > mostDigits)
				mostDigits = digits;
		}
		
		for(int j = 0; j < xGrid.length; j++){
			for(int i = 0; i < xGrid[j].length; i++){
				String s = (xGrid[i][j]) ? "X" : " " ;
				System.out.print(Util.center(s, mostDigits) + " ");
			}
			System.out.println();
		}
		System.out.println(Util.repeatChar('-', uNums.size() * (mostDigits + 1) - 1));
		for(T num : uNums){
			System.out.printf("%"+mostDigits+"s ", num.toString());
		}
		System.out.println();

	}
	
	public static <T extends Number> List<T> getMode(T[] uNums, Integer[] uNumF){
		return getMode(Arrays.asList(uNums), Arrays.asList(uNumF));
	}
	public static <T extends Number> List<T> getMode(List<T> uNums, List<Integer> uNumF){
		List<T> result = new ArrayList<T>();
		List<Integer> indeces = new ArrayList<Integer>();
		Integer largestF = 0;
		
		for(int i = 0; i < uNumF.size(); i++){
			if(uNumF.get(i) > largestF)
				largestF = uNumF.get(i);
		}
		
		for(int i = 0; i < uNumF.size(); i++){
			if(uNumF.get(i) == largestF)
				indeces.add(i);
		}
		
		for(int i = 0; i < indeces.size(); i++){
			result.add(uNums.get(indeces.get(i)));
		}
		return result;
	}
}