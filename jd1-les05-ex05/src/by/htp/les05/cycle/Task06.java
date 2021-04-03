package by.htp.les05.cycle;

public class Task06 {
// 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
	public static void task() {
		System.out.println("6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.");

		int a;
		a = 3;

		int i;
		i = 1;

		int sum;
		sum = 0;

		System.out.println("\t" + "Число: " + a);
		System.out.println();

		while (i <= a) {

			sum = sum + i;
			i++;
		}

		System.out.println("\t" + "Сумма чисел: " + sum);
		System.out.println();
	}
}
