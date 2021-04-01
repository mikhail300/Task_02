package by.htp.les04.branching;

import java.util.Scanner;

public class Task23 {
// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
	public static void task() {
		System.out.println("23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.");

		Scanner in = new Scanner(System.in);

		System.out.print("Введите число — от 1 до 31 ");
		int d = in.nextInt();

		System.out.print("Введите месяц — от 1 до 12 ");
		int m = in.nextInt();

		in.close();

		if (d < 1 || d > 31 || m < 1 || m > 12) {
			System.out.println("Введены некорректные данные.");
		}

		System.out.println();
	}
}
