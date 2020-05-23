package by.htp.les05.cycle;
// 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
public class Task_13 {
	public static void task() {
	System.out.println ("Task 13 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.");
	
	for (double x = -5; x <= 5; x = x + 0.5) {
		System.out.println("y(x = " + x + ") = " + (5 - x * x / 2));
	
	}
	}
}
