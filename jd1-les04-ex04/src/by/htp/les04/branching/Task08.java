package by.htp.les04.branching;

public class Task08 {
// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	public static void task() {
		System.out.println("8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.");
		
		int a;
		int b;
		
		a = -3;
		b = 2;
		
		System.out.println("\t" + "a = " + a + ", b = " +b);
		System.out.println();
		
		if (a*a < b*b) {
			
			System.out.println("\t" + "Квадрат числа a^2 = " + a*a + " наименьший.");
			
		}
		
		if (b*b < a*a) {
			
			System.out.println("\t" + "Квадрат числа b^2 = " + b*b + " наименьший.");
			
		}
		
		System.out.println();
	}
}
