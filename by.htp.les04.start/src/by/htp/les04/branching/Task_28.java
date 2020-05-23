package by.htp.les04.branching;

// 28. ƒаны три числа a, b, с. ќпределить, какое из них равно d. ≈сли ни одно не равно d, то найти max(d Ч a, d Ч b, d Чc).
public class Task_28 {
	public static void task() {
	System.out.println ("task_28. 28. ƒаны три числа a, b, с. ќпределить, какое из них равно d. ≈сли ни одно не равно d, то найти max(d Ч a, d Ч b, d Чc).");

	int a;
	int b;
	int c;
	int d;
	int da;
	int db;
	int dc;

	a = 4;
	b = 5;
	c = 3;
	d = 2;
	System.out.println ("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

	if (a == d) {
		System.out.println("a==d");
	} else if (b == d) {
		System.out.println("b==d");
	} else if (c == d) {
		System.out.println("c==d");
	} else {
		da = d - a;
		db = d - b;
		dc = d - c;
		if (da >= db && da >= dc) {
			System.out.println("max(d Ч a, d Ч b, d Чc) = " + da);
		} else if (db >= da && db >= dc) {
			System.out.println("max(d Ч a, d Ч b, d Чc) = " + db);
		} else {
			System.out.println("max(d Ч a, d Ч b, d Чc) = " + dc);
		}
	}
	}
}
