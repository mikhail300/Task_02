package by.htp.les04.branching;

public class Task14 {
// 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
	public static void task() {
		System.out.println("14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
		
		double corner1;
		double corner2 = 35;
		
		corner1 = 60;
		corner2 = 35;
		
		System.out.println("\t" + "угол 1 = " + corner1 + ", угол 2 = " + corner2);
		System.out.println();
		
		double corner3;
		corner3 = 180 - corner1 - corner2;

		if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
			
			System.out.println("\t" + "Треугольник существует");
			
			if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
			
				System.out.println("\t" + "Треугольник прямоугольный");
			
			}else{
			
				System.out.println("\t" + "Треугольник не прямоугольный");
			
			}
		
		}else{
			
			System.out.println("\t" + "Треугольник не существует");
		
		}
		
		System.out.println();
	}
}
