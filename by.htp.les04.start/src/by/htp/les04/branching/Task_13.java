package by.htp.les04.branching;
// 13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������.
public class Task_13 {
	public static void task() {
	System.out.println ("task_13. 13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������.");
	
	double x1;
	double y1;
	double x2;
	double y2;
	x1 = 4;
	y1 = 5;
	x2 = -3;
	y2 = 6;
	
	double c1;
	double c2;
	c1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
	c2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
	
	if ( c1 < c2) {
		System.out.println ( "����� A (" + x1 + "," + y1 + ") ����� ����� B (" + x2 + ", " + y2 + ")");
	}else if ( c1 > c2) {
		System.out.println ( "����� b (" + x2 + "," + y2 + ") ����� ����� A (" + x1 + ", " + y1 + ")");
	}
	}
}
