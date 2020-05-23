package by.htp.les04.branching;
// 18. ѕодсчитать количество отрицательных среди чисел а, b, с.
public class Task_18 {
	public static void task() {
	System.out.println ("task_18. 18. ѕодсчитать количество отрицательных среди чисел а, b, с.");
	
	int a;
	int b;
	int c;
	a = -3;
	b = 6;
	c = -3;
	int count;
	count = 0;
	
	if (a < 0) {
		count++;
	}
	if (b < 0) {
		count++;
	}
	if (c < 0) {
		count++;
	}

	System.out.println("—реди чисел " + a + ", " + b + ", " + c + " количество отрицательных: " + count);
	
	}
}
