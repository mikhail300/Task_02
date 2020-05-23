package by.htp.les04.branching;

// 36. Вычислить значение функции:
public class Task_36 {

	public static void task() {
	System.out.println ("task_36. 36. Вычислить значение функции:");
	double x, y;

	x = 1;

	if (x <= 3) {
		y = x * x - 3 * x + 9;
	} else {
		y = 1 / (Math.pow(x, 3) + 6);
	}

	System.out.println("F(x = " + x + ") = " + y);
	}
}
