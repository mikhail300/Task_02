package by.htp.les05.cycle;
// 15. ��������� : 1+2+4+8+...+ 2 � 10 �������.
public class Task_15 {
	public static void task() {
	System.out.println ("Task 15 15. ��������� : 1+2+4+8+...+ 2 � 10 �������.");
	
	int n;
	n = 1;
	int sum;
	sum = 0;
	
	while (n <= Math.pow(2, 10)) {
		sum += n;
		n *= 2;
	}
	System.out.println("����� = " + sum);
	}
	}

