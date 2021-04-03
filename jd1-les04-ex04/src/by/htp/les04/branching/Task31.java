package by.htp.les04.branching;

public class Task31 {
// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
	public static void task() {
		System.out.println("31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.");

		double a;
		double b;

		double x;
		double y;
		double z;

		a = 29.2;
		b = 9.4;

		x = 5.9;
		y = 13;
		z = 33;

		System.out.println("\t " + "Размер отверстия (" + a + " x " + b + "), размеры кирпича (" + x + " x " + y + " x " + z + ").");
		System.out.println();

		if ((x < a && (y < b || z < b)) || (x < b && (y < a || z < a)) || (y < a && z < b) || (z < a && y < b)) {
			
			System.out.println("\t " + "Кирпич пройдёт через отверстие.");

		} else {
			
			System.out.println("\t " + "Кирпич не пройдёт через отверстие.");
			
		}
		
		System.out.println();
	}
}
