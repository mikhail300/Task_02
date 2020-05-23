package by.htp.les04.branching;
// 8. —оставить программу нахождени€ наименьшего из квадратов двух чисел а и b.
public class Task_08 {
	public static void task() {
	System.out.println ("task_08. 8. —оставить программу нахождени€ наименьшего из квадратов двух чисел а и b.");
	
	int a;
	int b;
	
	a = -4;
	b = 3;
	
	
	
	if (Math.pow(a, 2) < Math.pow(b, 2)) {
		System.out.println (" вадрат числа a = " + a + " меньше квадрата числа b = " + b);
	}else if (Math.pow(a, 2) > Math.pow(b, 2)) {
		System.out.println (" вадрат числа b = " + b + " меньше квадрата числа a = " + a);
	}
}
}
