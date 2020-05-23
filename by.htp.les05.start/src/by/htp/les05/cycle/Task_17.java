package by.htp.les05.cycle;
// 17. ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
public class Task_17 {
	public static void task() {
	System.out.println ("Task 17 17. ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)");
	
	double a;
	a = 2.0;
	int n;
	n = 6;
	double rez;
	rez = 1.0;
	for (int i = 0; i < n; i++) {
		rez *= a + i;
	}
	System.out.println("результат = " + rez);
	}
	}

