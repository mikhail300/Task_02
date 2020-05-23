package by.htp.les05.cycle;
// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
public class Task_16 {
	public static void task() {
	System.out.println ("Task 16 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).");
	
	int sum = 3;
	long p = 3L;

	for (int i = 3; i <= 10; i++) {
		sum += i;
		p *= sum;
	}
	System.out.println("Произведение = " + p);
	}
	}

