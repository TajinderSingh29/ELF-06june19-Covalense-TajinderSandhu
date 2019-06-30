/*	
 * o/p	****
 		***
 		**
 		*	*/

public class Pattern2 {
	public static void main(String[] args) {
		int a = 4;
		for (int i = 1; i <= a; i++) {
			for (int j = i; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
