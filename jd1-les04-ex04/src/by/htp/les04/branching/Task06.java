package by.htp.les04.branching;

public class Task06 {
// 6. Составить программу: определения наибольшего из двух чисел а и b.
	public static void task() {
		System.out.println("6. Составить программу: определения наибольшего из двух чисел а и b.");
		
		int a;
		int b;
		
		a = 2;
		b = 4;
		
		System.out.println("\t" + "a = " + a + ", b = " +b);
		System.out.println();
		
		if (a > b) {
			
			System.out.println("\t" + "Наибольшее число a = " + a);
			
		}
		
		if (b > a) {
			
			System.out.println("\t" + "Наибольшее число b = " + b);
			
		}
		System.out.println();
	}
}
