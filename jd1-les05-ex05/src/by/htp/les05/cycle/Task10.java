package by.htp.les05.cycle;

import java.math.BigInteger;

public class Task10 {
// 10. Составить программу нахождения произведения квадратов первых двухсот чисел.
	public static void task() {
		System.out.println("10. Составить программу нахождения произведения квадратов первых двухсот чисел.");

		BigInteger p = BigInteger.valueOf(1);
		
		int x = 0;
		
		System.out.println();
		
		for (int i = 1; i <= 200; i++) {
			
			x = (int) Math.pow(i, 2);
			
			BigInteger b = BigInteger.valueOf(x);
			
			p = p.multiply(b);
			
		}
		
		System.out.println("\t" + "Произведение квадратов = " + p);
		System.out.println();
	}
}
