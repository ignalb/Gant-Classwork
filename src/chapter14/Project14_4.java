package chapter14;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Project14_4 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Concordance c = new Concordance(in.nextLine());
		
		System.out.println(c);
		
		in.close();
	}
	
}

class Concordance {
	HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
	Scanner reader;
	
	public Concordance(String filename){
		filename += (filename.substring(filename.length()-4, filename.length()).equals(".txt")) ? "" : ".txt";
		reader = new Scanner(filename);
		readFile();
	}
	
	private void readFile(){
		while(reader.hasNext()){
			String key = reader.next();
			if(frequencies.containsKey(key)){
				frequencies.replace(key, frequencies.get(key)+1);
			} else {
				frequencies.put(key, 1);
			}
		}
	}
	
	public String toString(){
		String result = "";
		for(Entry<String, Integer> entry : frequencies.entrySet()){
			result += entry.getKey() + ": " + entry.getValue() + "\n";
		}
		return result;
	}
}