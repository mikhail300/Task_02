package by.htp.les04.branching;

// 31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.
public class Task_31 {

	public static void task() {
	System.out.println ("task_31. 31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.");
	
	double a;
	double b;
	double x;
	double y;
	double z;

	a = 29.2;
	b = 9.4;

	x = 5.9;
	y = 13;
	z = 33;

	if ((x < a && (y < b || z < b)) || (x < b && (y < a || z < a)) || (y < a && z < b) || (z < a && y < b)) {
		System.out.println("������ ������ ����� ���������.");

	} else {
		System.out.println("������ �� ������ ����� ���������.");	}
	}
}
