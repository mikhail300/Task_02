package by.htp.les05.cycle;
// 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
public class Task_05 {
	public static void task() {
	System.out.println ("Task 05 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.");
	int i;
	i = 1;
	int s;
	s = 0;
	while (i <= 99) {
		s = s + i;
		//System.out.print (i + ", ");
		i = i + 2;
		
		
	}
	System.out.println ("Сумма нечетных чисел от 1 до 99 включительно = " + s);
	System.out.println ();
	}
}
