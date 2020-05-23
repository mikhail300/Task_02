package by.htp.les04.branching;

// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
public class Task_26 {
	public static void task() {
	System.out.println ("task_26. 26. Написать программу нахождения суммы большего и меньшего из трех чисел.");

	int a;
	int b;
	int c;
	a = 6;
	b = 3;
	c = 5;
	int sum;
	sum = 0;
	
	System.out.println ("a = " + a + ", b = " + b + ", c = " + c);
	
	if					(( a > b && b > c ) || ( a < b && b < c )) {
		sum = a + c;
	}else if			(( b > c && c > a ) || ( b < c && c < a )) {
		sum = b + a;
	}else if			(( c > a && a > b ) || ( c < a && a < b )) {
		sum = c + b;
	}
	
	System.out.println("Сумма = " + sum);
	}
}