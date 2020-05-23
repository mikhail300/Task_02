package by.htp.les04.branching;
// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
public class Task_07 {
	public static void task() {
	System.out.println ("task_07. 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х");
	
	int a;
	int b;
	int c;
	int x;
	a = - 2;
	b = 3;
	c = 4;
	x = 3;
	
	int result;
	result = a*x*x + b*x + c;
	System.out.println ("Выражение = " + result);
	if (result < 0) {
		result = - result;
	}
	
	System.out.println ("Модуль выражения = " + result);
	}
}
