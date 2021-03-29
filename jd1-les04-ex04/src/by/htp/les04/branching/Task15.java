package by.htp.les04.branching;

public class Task15 {
// 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.	
	public static void task() {
		System.out.println("15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.");
	
		double x;
		double y;
		
		x = 2.0;
		y = 3.0;
		
		System.out.println("\t" + "x = " + x + ", y = " + y);
		System.out.println();
		
		double newX;
		double newY;
		
		if (x < y) {
			
			newX = (x + y) / 2;
			newY = 2 * x * y;
		
		}else{
			
			newY = (x + y) / 2;
			newX = 2 * x * y;

		}
		
		x = newX;
		y = newY;
		
		System.out.println("\t" + "новые значения: x = " + x + " и y = " + y);
		
		System.out.println();
	}
}
