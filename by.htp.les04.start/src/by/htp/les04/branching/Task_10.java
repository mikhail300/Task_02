package by.htp.les04.branching;
// 10. Составить программу, которая определит площадь какого круга меньше.
public class Task_10 {
	public static void task() {
		System.out.println ("task_10. 10. Составить программу, которая определит площадь какого круга меньше.");
		
		double r1;
		double r2;
		
		r1 = 4;
		r2 = 3;
		
		
		if ((Math.PI * r1 * r1) < (Math.PI * r2 * r2)) {
			System.out.println ("Площадь круга с радиусом r1 = " + r1 + " меньше круга с радиусом r2 =" + r2);
		}else if ((Math.PI * r1 * r1) > (Math.PI * r2 * r2)){
			System.out.println ("Площадь круга с радиусом r2 = " + r2 + " меньше круга с радиусом r1 =" + r1);
		}
}
}
