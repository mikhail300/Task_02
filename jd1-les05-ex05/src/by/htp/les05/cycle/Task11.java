package by.htp.les05.cycle;

public class Task11 {
// 11. Составить программу нахождения разности кубов первых двухсот чисел.
	public static void task() {
		System.out.println("11. Составить программу нахождения разности кубов первых двухсот чисел.");

		int a;
		a = 0;

		int diff;
		diff = 0;

		System.out.println();

		while (a <= 200) {

			diff = diff - (int) Math.pow(a, 3);
			a++;

		}

		System.out.println("\t" + "Разность кубов = " + diff);
		System.out.println();
	}
}
