package by.htp.les04.branching;

public class Task19 {
// 19. Подсчитать количество положительных среди чисел а, b, с.
	public static void task() {
		System.out.println("19. Подсчитать количество положительных среди чисел а, b, с.");

		int a;
		int b;
		int c;

		a = -3;
		b = 6;
		c = -3;

		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c);
		System.out.println();

		int count;
		count = 0;

		if (a >= 0) {

			count++;

		}

		if (b >= 0) {

			count++;

		}

		if (c >= 0) {

			count++;

		}

		System.out.println("\t" + "Колличество положительных чисел: " + count);
		System.out.println();
	}
}
