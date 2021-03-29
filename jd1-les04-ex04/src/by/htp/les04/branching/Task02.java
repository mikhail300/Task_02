package by.htp.les04.branching;

public class Task02 {
// 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»
	public static void task() {
		System.out.println("2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»");
		
		int a;
		int b;
		
		a = 2;
		b = 3;
		
		System.out.println("\t" + "a = " + a + ", b = " + b);
		System.out.println();
		
		if (a < b) {
			
			System.out.println("\t" + "yes");
			
		}
		
		if (a > b) {
			
			System.out.println("\t" + "no");
			
		}
		System.out.println();
	}
}
