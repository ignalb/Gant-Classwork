package projects;

import java.util.Scanner;

public class Schedule {
	
	static int periods = 8;
	/**
	 *  X X X X X X X X<br>
	 *  X X X X X X X X<br>
	 *  X X X X X X X X<br>
	 *  Column = period<br>
	 *  Row1 = Class, Row2 = Teacher, Row3 = Room
	 */
	static String[][] schedule = new String[periods][3];
	static Scanner in = new Scanner(System.in);
	
	static void inputSchedule() {
		for(int i = 0; i < periods; i++){
			System.out.printf("Period %1d Class: ", i+1);
			schedule[i][0] = in.nextLine();
			System.out.printf("Period %1d Teacher: ", i+1);
			schedule[i][1] = in.nextLine();
			System.out.printf("Period %1d Room: ", i+1);
			schedule[i][2] = in.nextLine();
		}
	}
	
	static void printSchedule(String name, String school) {
		System.out.printf("==============================================\n"
						+ "\t%20s'S SCHEDULE\n"
						+ "----------------------------------------------\n"
						+ "  %30s\n"
						+ "==============================================\n", name.toUpperCase(), school.toUpperCase());
		for(int i = 0; i < periods; i++){
			System.out.printf("PERIOD %1d | %30s | %15s | ROOM %4s\n", i+1, schedule[i][0], schedule[i][1], schedule[i][2]);
		}
		System.out.println("==============================================");
	}
	
	public static void main (String[] args) {
		String name, school;
		
		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("School: ");
		school = in.nextLine();
		
		inputSchedule();
		printSchedule(name, school);
	}
	
}
