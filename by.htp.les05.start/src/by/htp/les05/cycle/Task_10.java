package by.htp.les05.cycle;
// Составить программу нахождения произведения квадратов первых двухсот чисел.
import java.math.BigInteger;
public class Task_10 {
	public static void task() {
	System.out.println ("Task 10 Составить программу нахождения произведения квадратов первых двухсот чисел.");
	BigInteger p = BigInteger.valueOf(1);
    int x = 0;
	for (int i = 1; i <= 200; i++) {
		x = (int) Math.pow(i, 2);
		BigInteger b = BigInteger.valueOf(x);
		p = p.multiply(b);
	}
	System.out.println("Произведение квадратов = " + p);
	}
}
