package by.htp.les04.branching;

public class Task24 {
// 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.
	public static void task() {
		System.out.println("24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков n.");

		int n;

		n = 8;

		System.out.println("\t" + "n = " + n);
		System.out.println();

		if (n % 2 == 0) {

			System.out.println("\t" + "Не любит!");

		} else {

			System.out.println("\t" + "Любит!");

		}

		System.out.println();
	}
}
