package by.htp.les05.cycle;

public class Task13 {
// 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
	public static void task() {
		System.out.println("13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.");
		
		System.out.println();
		for (double x = -5; x <= 5; x = x + 0.5) {
			System.out.println("y(x = " + x + ") = " + (5 - x * x / 2));
		
		}
		System.out.println();
	}
}
