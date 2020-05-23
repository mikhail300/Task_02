package by.htp.les04.branching;

// 27. Найти max{min(a, b), min(c, d)}.
public class Task_27 {
	public static void task() {
	System.out.println ("task_27. 27. Найти max{min(a, b), min(c, d)}.");

	int a;
	int b;
	int c;
	int d;
	int minab;
	int mincd;
	int max;
	a = 1;
	b = 0;
	c = 32;
	d = 23;
	
	System.out.println ("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	
	if (a <= b) {
		minab = a;
	} else {
		minab = b;
	}

	if (c <= d) {
		mincd = c;
	} else {
		mincd = d;
	}

	if (minab >= mincd) {
		max = minab;
	} else {
		max = mincd;
	}

	System.out.println("max{min(a, b), min(c, d)} = " + max);
	}
}

