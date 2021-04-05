package by.htp.les05.cycle;

public class Task15 {
// 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
	public static void task() {
		System.out.println("15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.");
		
		int n;
		n = 1;
		int sum;
		sum = 0;
		
		System.out.println();
		
		while (n <= Math.pow(2, 10)) {
			
			sum = sum + n;
			n = n * 2;
		}
		
		System.out.println("\t" + "Сумма: " + sum);
		System.out.println();
	}
}
