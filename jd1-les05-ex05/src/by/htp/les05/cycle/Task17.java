package by.htp.les05.cycle;

public class Task17 {
// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void task() {
		System.out.println("17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)");
		
		double a;
		a = 2.0;
		
		int n;
		n = 6;
		
		double rez;
		rez = 1.0;
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			rez = rez * (a + i);
			
		}
		
		System.out.println("\t" + "Результат: " + rez);
		System.out.println();
	}
}
