package by.htp.les05.cycle;

public class Task09 {
// 9. Найти сумму квадратов первых ста чисел.
	public static void task() {
		System.out.println("9. Найти сумму квадратов первых ста чисел.");
		
		int sum = 0;

		System.out.println ();
		
		for (int i = 1; i <= 100; i++) {
			
			sum += i * i;
			
		}

		System.out.println("\t" + "Сумма квадратов чисел от 1 до 100 равна: " + sum);
		
		System.out.println ();
	}
}
