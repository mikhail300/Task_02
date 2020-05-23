package by.htp.les04.branching;

// 38. Вычислить значение функции:
public class Task_38 {

	public static void task() {
	System.out.println ("task_38. 38. Вычислить значение функции:");
	double x;
	double y;

	x = 1;

	if (x <= 3 && x >= 0) {
		y = x * x;
	} else {
		y = 4;
	}

	System.out.println("F(x =" + x + ") = " + y);
	}
}
