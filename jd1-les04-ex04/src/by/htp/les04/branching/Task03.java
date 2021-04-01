package by.htp.les04.branching;

public class Task03 {
// 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
	public static void task() {
		System.out.println("3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».");

		int a;
		a = 4;

		System.out.println("\t" + "a = " + a);
		System.out.println();

		if (a < 3) {

			System.out.println("\t" + "yes");

		}

		if (a > 3) {

			System.out.println("\t" + "no");

		}

		System.out.println();
	}
}
