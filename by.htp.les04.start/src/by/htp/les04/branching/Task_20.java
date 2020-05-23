package by.htp.les04.branching;
// 20. Определить, делителем каких чисел а, b, с является число k.
public class Task_20 {
	public static void task() {
	System.out.println ("task_20. 20. Определить, делителем каких чисел а, b, с является число k.");
	
	int a;
	int b;
	int c;
	int k;
	a = -9;
	b = 6;
	c = -2;
	k = 3;
	 if (a % k == 0) {
		 System.out.println("Число " + k + " является делителем числа " + a);
	}
	 if (b % k == 0) {
		 System.out.println("Число " + k + " является делителем числа " + b);
	}
	if (c % k == 0) {
		System.out.println("Число " + k + " является делителем числа " + c);
	}
	
	}
}
