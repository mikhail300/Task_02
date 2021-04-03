package by.htp.les04.branching;

public class Task38 {
// 38. Вычислить значение функции:
	public static void task() {
		System.out.println("38. Вычислить значение функции:");
		
		double x;
		double y;

		x = 1;

		System.out.println("\t" + "x = " + x);
		System.out.println();
		
		if (x <= 3 && x >= 0) {
			
			y = x * x;
			
		} else {
			
			y = 4;
			
		}

		System.out.println("\t" + "F(x = " + x + ") = " + y);
		System.out.println();
	}
}
