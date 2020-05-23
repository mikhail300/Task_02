package by.htp.les05.cycle;
// 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task_06 {
	public static void task() {
	System.out.println ("Task 06 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.");
	int i;
	i = 1;
	int s;
	s = 0;
	int input;
	input = 3;
	while (i <= input) {
		s = s + i;
		//System.out.print (i + ", ");
		i = i + 1;
		
		
	}
	System.out.println ("Сумма чисел от 1 до " + input + " включительно = " + s);
	System.out.println ();
	}
}
