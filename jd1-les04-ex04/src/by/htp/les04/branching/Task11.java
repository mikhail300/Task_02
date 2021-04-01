package by.htp.les04.branching;

public class Task11 {
// 11. Составить программу, которая определит площадь какого треугольника больше.
	public static void task() {
		System.out.println("11. Составить программу, которая определит площадь какого треугольника больше.");

		double a1 = 4;
		double b1 = 4;
		double c1 = 4;
		double a2 = 5;
		double b2 = 5;
		double c2 = 5;

		System.out.println("\t" + "Треугольник 1 со сторонами a1 = " + a1 + ", b1 = " + b1 + ", c1 = " + c1);
		System.out.println("\t" + "Треугольник 2 со сторонами a2 = " + a2 + ", b2 = " + b2 + ", c2 = " + c2);
		System.out.println();

		double p1 = (a1 + b1 + c1) / 2;
		double p2 = (a2 + b2 + c2) / 2;

		double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		double s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (s1 > s2) {

			System.out.println("\t" + "Площадь треугольника 1 бельше площади треугольника 2");

		}
		if (s2 > s1) {

			System.out.println("\t" + "лощадь треугольника 2 бельше площади треугольника 1");

		}

		System.out.println();
	}
}
