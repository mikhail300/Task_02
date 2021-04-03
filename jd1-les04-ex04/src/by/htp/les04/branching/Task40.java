package by.htp.les04.branching;

public class Task40 {
// 40. Вычислить значение функции:
	public static void task() {
		System.out.println("40. Вычислить значение функции:");

		double x;
		double y;

		x = 1;

		System.out.println("\t" + "x = " + x);
		System.out.println();

		if (x <= 13) {

			y = -Math.pow(x, 3) + 9;

		} else {

			y = -3 / (x + 1);

		}

		System.out.println("\t" + "F(x = " + x + ") = " + y);
		System.out.println();
	}
}
