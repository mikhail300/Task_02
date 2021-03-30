package by.htp.les04.branching;

public class Task22 {
// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
	public static void task() {
		System.out.println("22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.");
				
		int x;
		int y;
		
		x = 3;
		y = 4;
		
		System.out.println("\t" + "x = " + x + ", y = " + y);
		System.out.println();
		
		int tmp;
		
		if (x < y) {
			
			tmp = x;
			x = y;
			y = tmp;
		
		}
		
		System.out.println("\t" + "x = " + x + ", y = " + y);
		System.out.println();
	}
}
