package chapter10;

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
	
}
