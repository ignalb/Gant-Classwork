package chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Project14_2 {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner file, in = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		String filename = in.nextLine();
		filename += (filename.substring(filename.length()-4, filename.length()).equals(".txt")) ? "" : ".txt";
		file = new Scanner(new File(filename));
		in.close();
		
		while(file.hasNext()){
			set.add(file.nextInt());
		}
		file.close();
		
		System.out.println(setToString(set));
	}
	
	private static <T> String setToString(Set<T> set){
		String result = "{ ";
		for(T t : set){
			result += t.toString() + " ";
		}
		return result + "}";
	}
	
}
