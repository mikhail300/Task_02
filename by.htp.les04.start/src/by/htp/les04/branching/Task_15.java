package by.htp.les04.branching;
// 15. ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.
public class Task_15 {
	public static void task() {
	System.out.println ("task_15. 15. ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.");
	
	double x;
	double y;
	x = 2.0;
	y = 3.0;
	
	double newX;
	double newY;
	
	System.out.println ("��� ����� " + x + " � " + y);
	if (x < y) {
		newX = (x + y) / 2;
		newY = 2 * x * y;
	} else {
		newY = (x + y) / 2;
		newX = 2 * x * y;
	}
	System.out.println("����� ��������: " + newX + " � " + newY);
	}
}
