package by.htp.les04.branching;

public class Task12 {
// 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
	public static void task() {
		System.out.println("12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.");

		double a;
		double b;
		double c;

		a = 4;
		b = -3;
		c = -3;

		System.out.println("\t" + "a = " + a + " b = " + b + " c = " + c);
		System.out.println();

		if (a < 0) {
			a = Math.pow(a, 2);
		}
		a = Math.pow(a, 2);

		System.out.println("\t" + "число a после операции возведения = " + a);

		if (b < 0) {
			b = Math.pow(b, 2);
		}
		b = Math.pow(b, 2);

		System.out.println("\t" + "число b после операции возведения = " + b);

		if (c < 0) {
			c = Math.pow(c, 2);
		}
		c = Math.pow(c, 2);

		System.out.println("\t" + "число c после операции возведения = " + c);

		System.out.println();
	}
}
