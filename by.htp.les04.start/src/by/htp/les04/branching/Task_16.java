package by.htp.les04.branching;
// 16. �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).
public class Task_16 {
	public static void task() {
	System.out.println ("task_16. 16. �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).");
	
	double x;
	double y;
	x = - 2.0;
	y= -5.0;
	
	if (x > 0 && y > 0) {
		System.out.println("����� (" + x + ", " + y + ") ��������� � 1 ��������");
	}else if (x < 0 && y > 0) {
		System.out.println("����� (" + x + ", " + y + ") ��������� �� 2 ��������");
	}else if (x < 0 && y < 0) {
		System.out.println("����� (" + x + ", " + y + ") ��������� � 3 ��������");
	}else if (x > 0 && y < 0){
		System.out.println("����� (" + x + ", " + y + ") ��������� � 4 ��������");
	}else if (x == 0 && y != 0){
		System.out.println("����� (" + x + ", " + y + ") ��������� �� ��� y");
	}else if (x != 0 && y == 0){
		System.out.println("����� (" + x + ", " + y + ") ��������� �� ��� x");
	}else if (x == 0 && y == 0){
		System.out.println("����� (" + x + ", " + y + ") ��������� � ������ ���������");
	}
	
	}
}
