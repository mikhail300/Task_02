package by.htp.les04.branching;

public class Task09 {
// 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
	public static void task() {
		System.out.println("9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.");

		int a;
		int b;
		int c;

		a = 3;
		b = 2;
		c = 3;

		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c);
		System.out.println();

		if (a == b && b == c) {

			System.out.println("\t" + "треугольник равносторонний.");

		} else {
			System.out.println("\t" + "треугольник не равносторонний");
		}

		System.out.println();
	}
}
