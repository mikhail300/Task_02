package by.htp.les04.branching;

public class Task36 {
// 36. Вычислить значение функции:
	public static void task() {
		System.out.println("36. Вычислить значение функции:");

		double x, y;

		x = 1;
		
		System.out.println("\t" + "x = " +  x);
		System.out.println();

		if (x <= 3) {

			y = x * x - 3 * x + 9;

		} else {

			y = 1 / (Math.pow(x, 3) + 6);

		}

		System.out.println("\t" + "F(x = " + x + ") = " + y);
		System.out.println();
	}
}
