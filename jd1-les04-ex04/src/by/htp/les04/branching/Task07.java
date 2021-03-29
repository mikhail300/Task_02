package by.htp.les04.branching;

public class Task07 {
// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
	public static void task() {
		System.out.println("7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х");
		
		int a;
		int b;
		int c;
		int x;
		
		a = - 2;
		b = 3;
		c = 4;
		x = 3;
		
		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c + ", x = " + x);
		System.out.println();
		
		int result;
		
		result = a*x*x + b*x + c;
		
		if (result < 0) {
			result = - result;
		}
		
		System.out.println ("\t" + "Модуль выражения = " + result);
		System.out.println();
	}
}
