package chapter10;

import java.util.Arrays;
import java.util.List;

public class Util {

	public static <T> String arrayToString(T[] ts){
		return arrayToString(Arrays.asList(ts));
	}
	public static <T> String arrayToString(T[] ts, char c){
		return arrayToString(Arrays.asList(ts), c);
	}
	public static <T> String arrayToString(List<T> ts){
		return arrayToString(ts, ',');
	}
	public static <T> String arrayToString(List<T> ts, char c){
		String result = "";
		for(int i = 0; i < ts.size(); i++){
			result += ts.get(i);
			if(i < ts.size() - 1)
				result += (c + " ");
		}
		return result;
	}
	
	public static <T> void printArray(T[] ts){
		System.out.println(arrayToString(ts));
	}
	public static <T> void printlnArray(T[] ts){
		for(T t : ts){
			System.out.println(t);
		}
	}
	
	public static String repeatChar(char c, int i){
		String result = "";
		for(; i > 0; i--){
			result += c;
		}
		return result;
	}
	
	public static String center(String s, int l){
		String result = "";
		if(s.length() > l)
			s = s.substring(0, l);
		int sL, sR;
		sL = Math.floorDiv(l, 2);
		sR = (l % 2 == 0) ? sL - 1 : sL;
		
		if(sL > 0)
			result += String.format("%"+sL+"s", "");
		result += String.format("%"+s.length()+"s", s);
		if(sR > 0)
			result += String.format("%"+sR+"s", "");
		
		return result;
	}
	
}
