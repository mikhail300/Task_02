package by.htp.les04.branching;

import static java.lang.Math.abs;

public class Task30 {
// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
	public static void task() {
		System.out.println("30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.");

		double a;
		double b;
		double c;

		a = -2;
		b = 3;
		c = 0;

		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c);
		System.out.println();

		if (a > b && b > c) {

			a = 2 * a;
			b = 2 * b;
			c = 2 * c;

		} else {

			a = abs(a);
			b = abs(b);
			c = abs(c);

		}

		System.out.println("\t" + "Итоговые значения a, b и c: " + a + ", " + b + ", " + c);

		System.out.println();
	}
}
