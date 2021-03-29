package by.htp.les04.branching;

public class Task05 {
// 5. Составить программу: определения наименьшего из двух чисел а и b.
	public static void task() {
		System.out.println("5. Составить программу: определения наименьшего из двух чисел а и b.");
		
		int a;
		int b;
		
		a = 4;
		b = 6;
		
		System.out.println();
		System.out.println("\t" + "a = " + a + ", b = " + b);
		
		if (a < b) {
			
			System.out.println("\t" + "Наименьшее число a = " + a);
			
		}
		
		if (b < a) {
			
			System.out.println("\t" + "Наименьшее число b = " + b);
			
		}
		
	}
}
