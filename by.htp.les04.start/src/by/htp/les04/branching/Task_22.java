package by.htp.les04.branching;
// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
public class Task_22 {
	public static void task() {
		System.out.println ("task_22. 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.");

		int x;
		int y;
		int tmp;
		x = 5;
		y = 6;
		
		System.out.println ("Дано x = " + x + ", y = "+ y);
		if (x < y ) {
			tmp = x;
			x = y;
			y = tmp;
		}
		System.out.println ("Получилось  большее x = " + x + ", меньшее y = "+ y);
}
}
