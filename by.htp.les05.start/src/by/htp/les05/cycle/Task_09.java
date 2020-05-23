package by.htp.les05.cycle;
// 9. Найти сумму квадратов первых ста чисел.
public class Task_09 {
	public static void task() {
	System.out.println ("Task 09 9. Найти сумму квадратов первых ста чисел.");
	int sum = 0;

	for (int i = 1; i <= 100; i++) {
		sum += i * i;
		
	}

	System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
	
	System.out.println ();
	}
}
