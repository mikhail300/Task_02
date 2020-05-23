package by.htp.les05.cycle;
// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
public class Task_14 {
	public static void task() {
	System.out.println ("Task 14 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.");
	
	double n;
	n = 1.0;
	
	double sum;
	sum = 0;
	
	while(n <= 15.0) {
		sum = sum + 1/n;
		n++;
	}
	System.out.println("Сумма = " + sum);
	}
	}

