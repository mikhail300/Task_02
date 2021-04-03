package by.htp.les04.branching;

public class Task32 {
// 32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
	public static void task() {
		System.out.println("32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.");
		
		int a = -5;
		int b = 8;
		int c = -8;

		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c);
		System.out.println();
		
		if ((a + b) > 0 || (a + c) > 0 || (b + c) > 0) {
			
			System.out.println("\t" + "Является положительной");
			
		} else {
			
			System.out.println("\t" + "Не является положительной");
			
		}
		
		System.out.println();
	}
}
