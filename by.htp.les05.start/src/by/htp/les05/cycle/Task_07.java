package by.htp.les05.cycle;
// 7. Вычислить значения функции на отрезке [а,b] c шагом h:
public class Task_07 {
	public static void task() {
	System.out.println ("Task 07 7. Вычислить значения функции на отрезке [а,b] c шагом h:");
	int a;
	a = -4;
	int b;
	b = 6;
	int h;
	h = 1;
	int y;
	y = 0;
	
	while (a <= b) {
		
		//System.out.print (i + ", ");
		//i = i + 1;
		if (a > 2) {
			y = a;
		}else if (a <= 2) {
			y = -a ;
		}
		System.out.println("При х = " + a + " у = " + y);
		a = a + h;
	}
	
	System.out.println ();
	}
}
