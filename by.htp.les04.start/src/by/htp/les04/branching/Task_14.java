package by.htp.les04.branching;
// 14. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
public class Task_14 {
	public static void task() {
	System.out.println ("task_14. 14. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.");
	
	double corner1;
	double corner2 = 35;
	corner1 = 60;
	corner2 = 35;
	
	double corner3;
	corner3 = 180 - corner1 - corner2;

	if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
		System.out.println("����������� ����������");
		if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
			System.out.println("����������� �������������");
		}else {
			System.out.println("����������� �� �������������");
		}
	} else {
		System.out.println("����������� �� ����������");
	}
	}
}
