package by.htp.les04.branching;
// 5. Составить программу: определения наименьшего из двух чисел а и b.
public class Task_05 {
	public static void task() {
	System.out.println ("task_05. 5. Составить программу: определения наименьшего из двух чисел а и b.");
	
	int a;
	int b;
	a = 2;
	b = 3;
	
	if (a < b) {
		System.out.println ("число a = " + a + " меньше числа b = " + b);
	}else if ( b < a){
		System.out.println ("число b = " + b + " меньше числа a = " + a);
	}
	}
}
