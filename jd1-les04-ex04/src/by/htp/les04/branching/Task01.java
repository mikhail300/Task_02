package by.htp.les04.branching;

public class Task01 {
// 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
	public static void task() {
		System.out.println("1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.");
		
		int a;
		int b;
		
		a = 6;
		b = 4;
		
		System.out.println("\t" + "a = " + a + ", b = " + b);
		System.out.println();
		
		if (a < b) {
			
			System.out.println("\t" + "7");
		
		}
		
		if (a > b) {
		
			System.out.println("\t" + "8");
		
		}
		System.out.println();
	}
}
