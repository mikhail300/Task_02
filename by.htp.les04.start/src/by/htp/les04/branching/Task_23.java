package by.htp.les04.branching;

import java.util.Scanner;

// 23. ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.
public class Task_23 {
	public static void task() {
	System.out.println ("task_23. 23. ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.");

	Scanner in = new Scanner(System.in);

	System.out.print("¬ведите число Ч от 1 до 31 ");
	int d = in.nextInt();

	System.out.print("¬ведите мес€ц Ч от 1 до 12 ");
	int m = in.nextInt();

	in.close();

	if (d < 1 || d > 31 || m < 1 || m > 12) {
		System.out.println("¬ведены некорректные данные.");
	} else {
		//System.out.println("¬ведены корректные данные.");
	}
}
}
