package chapter02;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project2_4 {
	
	/**Converts from years to minutes
	 * @param year
	 * @return minutes
	 */
	private static long yearToMin(int year) {
		return year * 365 * 24 * 60;
	}
	
	public static void main (String [] args){
		System.out.println(yearToMin(1) + " minutes in one year");
	}
	
}
