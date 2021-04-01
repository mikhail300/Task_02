package by.htp.les04.branching;

public class Task29 {
// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
	public static void task() {
		System.out.println("29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");

		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 2;
		y1 = 1;
		x2 = 1;
		y2 = 2;
		x3 = 1;
		y3 = 3;
		
		System.out.println("\t" + "A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
		System.out.println();

		if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {

			System.out.println("\t" + "Точки расположены на одной прямой.");

		} else if ((x1 == x2 && x2 != x3) || (x1 != x2 && x2 == x3) || (y1 != y2 && y2 == y3)
				|| (y1 == y2 && y2 != y3)) {

			System.out.println("\t" + "Точки не расположены на одной прямой.");

		} else if ((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)) { // это условие в последнюю очередь, что бы не
																		// получить деление на ноль

			System.out.println("\t" + "Точки не расположены на одной прямой.");

		}
		System.out.println();
	}
}
