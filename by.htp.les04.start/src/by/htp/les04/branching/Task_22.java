package by.htp.les04.branching;
// 22. ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������.
public class Task_22 {
	public static void task() {
		System.out.println ("task_22. 22. ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������.");

		int x;
		int y;
		int tmp;
		x = 5;
		y = 6;
		
		System.out.println ("���� x = " + x + ", y = "+ y);
		if (x < y ) {
			tmp = x;
			x = y;
			y = tmp;
		}
		System.out.println ("����������  ������� x = " + x + ", ������� y = "+ y);
}
}
