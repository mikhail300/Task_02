package by.htp.les04.branching;

public class Task13 {
// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
	public static void task() {
		System.out.println("13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.");
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		x1 = 4;
		y1 = 5;
		x2 = -3;
		y2 = 6;
		
		System.out.println("\t" + "A(x1 = " + x1 + ", y1 = " + y1 + "), B(x2 = " + x2 + ", y2 = " + y2 + ")");
		System.out.println();
		
		double c1;
		double c2;
		
		c1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		c2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		
		if ( c1 < c2) {
		
			System.out.println ("\t" + "Точка A (" + x1 + ", " + y1 + ") ближе точки B (" + x2 + ", " + y2 + ")");
			
		}
		
		if ( c1 > c2) {
		
			System.out.println ("\t" + "Точка b (" + x2 + ", " + y2 + ") ближе точки A (" + x1 + ", " + y1 + ")");
		
		}
		
		System.out.println();
	}
}
