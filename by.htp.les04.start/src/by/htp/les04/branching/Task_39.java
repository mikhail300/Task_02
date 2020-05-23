package by.htp.les04.branching;

// 39. Вычислить значение функции:
public class Task_39 {

	public static void task() {
	System.out.println ("task_39. 39. Вычислить значение функции:");
	double x;
	double y;
	
	x = 1;

	if (x >= 8) {
		y = -x * x + x - 9;
	} else {
		y = 1 / (Math.pow(x, 4) - 6);
	}

	if (Math.pow(x, 4) == 6) {
		System.out.println("F(x = " + x + ") = infinity.");
	} else {
		System.out.println("F(x = " + x + ") = " + y);
	}
}
}