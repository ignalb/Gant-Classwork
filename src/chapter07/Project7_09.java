package chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner reader;
		String fileName;
		String word;	//Word to Find
		int count = 0;
		
		System.out.print("File to be searhed: ");
		fileName = in.next();
		fileName += fileName.contains(".txt") ? "" : ".txt";
		try {
			reader = new Scanner(new File("src/chapter7/" + fileName));
			System.out.print("Word to search: ");
			word = in.next();
			
			while(reader.hasNext()) {
				if(reader.next().equalsIgnoreCase(word)){
					count++;
				}
			}
			System.out.print("Reached end of document. ");
			if(count == 0){
				System.out.println("There were no cases of \"" + word + "\".");
			} else {
				System.out.println("Word \"" + word + "\" found " + count + " time(s).");
			}
			reader.close();
		} catch(FileNotFoundException e) {
			System.err.print("File Not Found");
		} catch(Exception e) {
			System.err.print(e.getMessage());
		}
		
		in.close();
	}
	
}
