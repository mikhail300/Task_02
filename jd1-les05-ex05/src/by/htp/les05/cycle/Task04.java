package by.htp.les05.cycle;

public class Task04 {
// 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100	включительно.
	public static void task() {
		System.out.println(
				"4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.");

		int i;
		i = 2;

		while (i <= 100) {

			if (i % 2 == 0) {

				System.out.print("\t" + i);

			}
			i++;
		}

		System.out.println();
		System.out.println();
	}
}
