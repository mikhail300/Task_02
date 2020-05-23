package by.htp.les04.branching;
// 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
public class Task_12 {
	public static void task() {
	System.out.println ("task_12. 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.");
	
	double a;
	double b;
	double c;
	a = 4;
	b = 3;
	c = -3;
	System.out.println ("a = " + a + " b = " + b + " c = " + c );
	if (a < 0) {
		a = Math.pow(a, 2);
	}
	a = Math.pow(a, 2);
	System.out.println ("a = " + a);
	
	if (b < 0) {
		b = Math.pow(b, 2);
	}
	b = Math.pow(b, 2);
	System.out.println ("b = " + b);
	
	if (c < 0) {
		c = Math.pow(c, 2);
	}
	c = Math.pow(c, 2);
	System.out.println ("c = " + c);
	
	}
}
