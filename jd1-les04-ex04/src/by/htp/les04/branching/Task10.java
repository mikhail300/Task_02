package by.htp.les04.branching;

public class Task10 {
// 10. Составить программу, которая определит площадь какого круга меньше.
	public static void task() {
		System.out.println("10. Составить программу, которая определит площадь какого круга меньше.");
		
		double r1;
		double r2;
		
		r1 = 4;
		r2 = 3;
		
		System.out.println("\t" + "r1 = " + r1 + ", r2 = " + r2);
		System.out.println();
				
		if (Math.PI * r1 * r1 < Math.PI * r2 * r2) {
			
			System.out.println ("\t" + "Площадь круга с радиусом r1 = " + r1 + " меньше круга с радиусом r2 =" + r2);
			
		}
		
		if (Math.PI * r1 * r1 > Math.PI * r2 * r2){
			
			System.out.println ("\t" + "Площадь круга с радиусом r2 = " + r2 + " меньше круга с радиусом r1 =" + r1);
			
		}
		
		System.out.println();
	}
}
