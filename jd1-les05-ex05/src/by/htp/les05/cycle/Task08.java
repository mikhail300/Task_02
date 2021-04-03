package by.htp.les05.cycle;

public class Task08 {
// 8. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void task() {
		System.out.println("8. Вычислить значения функции на отрезке [а,b] c шагом h:");

		int a;
		int b;

		a = 10;
		b = 16;

		int h;
		h = 1;

		int y;
		y = 0;

		int c;
		c = 1;

		System.out.println("\t" + "Отрезок [" + a + ", " + b + "], шаг: " + h);
		System.out.println();

		while (a <= b) {

			// System.out.print (i + ", ");
			// i = i + 1;
			if (a == 15) {

				y = (a + c) * 2;

			} else if (a != 15) {

				y = (a - c) + 6;

			}

			System.out.println("\t" + "Для x = " + a + " y = " + y);
			a = a + h;
		}

		System.out.println();
	}
}
