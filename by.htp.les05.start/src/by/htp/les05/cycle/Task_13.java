package by.htp.les05.cycle;
// 13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.
public class Task_13 {
	public static void task() {
	System.out.println ("Task 13 13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.");
	
	for (double x = -5; x <= 5; x = x + 0.5) {
		System.out.println("y(x = " + x + ") = " + (5 - x * x / 2));
	
	}
	}
}
