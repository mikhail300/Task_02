package by.htp.les04.branching;

public class Task39 {
// 39. Вычислить значение функции:
	public static void task() {
		System.out.println("39. Вычислить значение функции:");	
		
		double x;
		double y;
		
		x = 1;

		System.out.println("\t" + "x = " + x);
		System.out.println();
		
		if (x >= 8) {
			
			y = -x * x + x - 9;
			
		} else {
			
			y = 1 / (Math.pow(x, 4) - 6);
			
		}

		if (Math.pow(x, 4) == 6) {
			
			System.out.println("\t" + "F(x = " + x + ") = infinity.");
			
		} else {
			
			System.out.println("\t" + "F(x = " + x + ") = " + y);
			
		}
		System.out.println();
	}
}
