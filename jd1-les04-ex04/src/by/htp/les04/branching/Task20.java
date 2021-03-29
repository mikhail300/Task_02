package by.htp.les04.branching;

public class Task20 {
// 20. Определить, делителем каких чисел а, b, с является число k.
	public static void task() {
		System.out.println("20. Определить, делителем каких чисел а, b, с является число k.");
		
		int a;
		int b;
		int c;
		int k;
		
		a = -9;
		b = 6;
		c = -2;
		k = 3;
		
		System.out.println("\t" + "a = " + a + ", b = " + b + ", c = " + c + ", k = " + k);
		System.out.println();
		
		if (a % k == 0) {
			
			 System.out.println("\t" + "число k = " + k + " является делителем числа a = " + a);
			 
		}
		
		 if (b % k == 0) {
			 
			 System.out.println("\t" + "число k = " + k + " является делителем числа c = " + b);
			 
		}
		 
		if (c % k == 0) {
			
			System.out.println("\t" + "число k = " + k + " является делителем числа c = " + c);
			
		}
		
		System.out.println();
	}
}
