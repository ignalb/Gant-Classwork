package chapter7;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_7 {

	public static void main(String[] args){
		
		for(int x = 1; x <= 10; x++){
			for(int y = 1; y <= 10; y++){
				System.out.printf("x: %2dft  y: %2sdft  |  P = %3d  |  A = %3d\n", x, y, 2*x+2*y, x*y);
			}
		}
		
	}
	
}
