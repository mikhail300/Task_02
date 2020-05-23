package by.htp.les04.branching;

// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task_31 {

	public static void task() {
	System.out.println ("task_31. 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.");
	
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

	if ((x < a && (y < b || z < b)) || (x < b && (y < a || z < a)) || (y < a && z < b) || (z < a && y < b)) {
		System.out.println("Кирпич пройдёт через отверстие.");

	} else {
		System.out.println("Кирпич не пройдёт через отверстие.");	}
	}
}
