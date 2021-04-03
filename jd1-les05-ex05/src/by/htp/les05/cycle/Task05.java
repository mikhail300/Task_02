package by.htp.les05.cycle;

public class Task05 {
// 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
	public static void task() {
		System.out.println("5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.");

		int i;
		i = 1;

		int sum;
		sum = 0;

		System.out.println();

		while (i <= 99) {

			if (i % 2 > 0) {

				sum = sum + i;

			}
			i++;
		}
		System.out.println("\t" + "Сумма нечетных чисел от 1 до 99 включительно: " + sum);
		System.out.println();
	}
}
