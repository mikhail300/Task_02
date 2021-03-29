package by.htp.les04.branching;

public class Task17 {
// 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
	public static void task() {
		System.out.println("17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.");
		
		int m;
		int n;
		
		m = 2;
		n= 3;
		
		System.out.println("\t" + "m = " + m + ", n = " + n );
		System.out.println();
		
		if (m == n) {
			
			m = n = 0;

		}
		
		if (m > n ) {
			n = m;
			
		}	
		
		m = n;
		
		System.out.println("\t" + "Результат m = " + m + ", n = " + n );
		
		System.out.println();
	}
}
