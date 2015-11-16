package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_08 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String sentence;
		
		System.out.println("Write a sentence to receive statistical information on it:");
		sentence = in.nextLine();
		
		StringAnalysis.runAnalysis(sentence);
		
		in.close();
	}
	
}

class StringAnalysis {
	static int wordCount;
	static char[] sentence;
	static ArrayList<Integer> wordLengths = new ArrayList<Integer>();
	static double avgWordLength;
	
	public static void runAnalysis(String s) {
		s += " ";
		sentence = s.toCharArray();
		calculateStats(sentence);
		System.out.printf("Sentence contains %d WORDS with a LENGTH OF %d characters and an AVG WORD LENGTH of %.2f\n",
				wordCount,
				sentence.length-1,
				avgWordLength);
	}
	
	static boolean isLetter(char c) {
		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
			return true;
		} else {
			return false;
		}
	}
	
	static <T extends Number> double sumOfArrayList(ArrayList<T> list){
		double sum = 0;
		for(T num: list){
			sum += num.doubleValue();
		}
		return sum;
	}
	
	static void calculateStats(char[] s) {
		char prev = ' ';
		int words = 0;
		int wordLength = 0;
		
		for(char c: s){
			if(!isLetter(c)){
				if(isLetter(prev)){
					wordLengths.add(wordLength);
					wordLength = 0;
					words++;
				}
			} else {
				wordLength++;
			}
			prev = c;
		}
		wordCount = words;
		avgWordLength = sumOfArrayList(wordLengths) / wordCount;
	}
	
}