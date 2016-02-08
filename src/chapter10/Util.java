package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public static <T> String arrayToString(T[] ts){
		return arrayToString(ts, ',');
	}
	public static <T> String arrayToString(T[] ts, char c){
		String result = "";
		for(int i = 0; i < ts.length; i++){
			result += ts[i];
			if(i < ts.length - 1)
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
	
	public static String getRepChar(char c, int n){
		String result = "";
		for(int i = 0; i < n; i++){
			result += c;
		}
		return result;
	}
	
	public static String center(String s, int l){
		int sL, sR;
		if(s.length() > l)
			s = s.substring(0, l);
		if(s.length() == l)
			return s;
		
		sL = Math.floorDiv(l, 2);
		sR = (l % 2 == 0) ? sL - 1 : sL;
		
		String format = "";
		List<String> param = new ArrayList<String>();
		if(sL > 0){
			format += "%"+sL+"s";
			param.add("");
		}
		format += "%"+s.length()+"s";
		param.add(s);
		if(sR > 0){
			format += "%"+sR+"s";
			param.add("");
		}
		
		switch(param.size()){
			case 1:
				return String.format(format, param.get(0));
			case 2:
				return String.format(format, param.get(0), param.get(1));
			case 3:
				return String.format(format, param.get(0), param.get(1), param.get(2));
			default:
				return s;
		}
	}
}
