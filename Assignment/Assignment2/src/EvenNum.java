
public class EvenNum {
	public static void main(String[] args) {
		int a=100;
		int i;
		for ( i = 1; i <= a; i++) {
			if (i % 2 ==0 ) {
				if (i % 5 == 0) {
					System.out.println("Even Number That are divisible by " + i);
				}
			}
		}
	}

}
