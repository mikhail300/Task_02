package by.htp.les04.branching;

public class Task28 {
// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
	public static void task() {
		System.out.println(
				"28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).");

		int a;
		int b;
		int c;
		int d;

		int da;
		int db;
		int dc;

		a = 4;
		b = 5;
		c = 3;
		d = 2;

		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		System.out.println();

		if (a == d) {

			System.out.println("\t" + "a==d");

		} else if (b == d) {

			System.out.println("\t" + "b==d");

		} else if (c == d) {

			System.out.println("\t" + "c==d");

		} else {

			da = d - a;
			db = d - b;
			dc = d - c;

			if (da >= db && da >= dc) {

				System.out.println("\t" + "max(d — a, d — b, d —c) = " + da);

			} else if (db >= da && db >= dc) {

				System.out.println("\t" + "max(d — a, d — b, d —c) = " + db);

			} else {

				System.out.println("\t" + "max(d — a, d — b, d —c) = " + dc);

			}
		}
	}
}
