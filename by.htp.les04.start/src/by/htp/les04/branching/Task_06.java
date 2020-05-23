package by.htp.les04.branching;
// 6. Составить программу: определения наибольшего из двух чисел а и b.
public class Task_06 {
	public static void task() {
	System.out.println ("task_06. 6. Составить программу: определения наибольшего из двух чисел а и b.");
	
	int a;
	int b;
	a = 2;
	b = 3;
	
	if (a > b) {
		System.out.println ("число a = " + a + " больше числа b = " + b);
	}else if ( b > a){
		System.out.println ("число b = " + b + " больше числа a = " + a);
	}
	}
}
