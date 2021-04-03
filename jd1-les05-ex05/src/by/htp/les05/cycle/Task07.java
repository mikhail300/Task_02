package by.htp.les05.cycle;

public class Task07 {
// 7. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void task() {
		System.out.println("7. Вычислить значения функции на отрезке [а,b] c шагом h:");

		int a;
		int b;

		a = -4;
		b = 6;

		int h;
		h = 1;

		int y;
		y = 0;

		System.out.println("\t" + "Отрезок [" + a + ", " + b + "], шаг: " + h);
		System.out.println();

		while (a <= b) {

			// System.out.print (i + ", ");
			// i = i + 1;
			if (a > 2) {

				y = a;

			} else if (a <= 2) {

				y = -a;

			}

			System.out.println("\t" + "При x = " + a + " y = " + y);
			a = a + h;
		}

		System.out.println();
	}
}
