package by.htp.les05.cycle;

public class Task16 {
// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
	public static void task() {
		System.out.println("16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).");
		
		int sum = 3;
		long p = 3L;

		System.out.println();
		
		for (int i = 3; i <= 10; i++) {
			
			sum = sum + i;
			p = p * sum;
			
		}
		
		System.out.println("\t" + "Произведение: " + p);
		System.out.println();
	}
}
