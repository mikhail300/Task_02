package by.htp.les04.branching;
// 8. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.
public class Task_08 {
	public static void task() {
	System.out.println ("task_08. 8. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.");
	
	int a;
	int b;
	
	a = -4;
	b = 3;
	
	
	
	if (Math.pow(a, 2) < Math.pow(b, 2)) {
		System.out.println ("������� ����� a = " + a + " ������ �������� ����� b = " + b);
	}else if (Math.pow(a, 2) > Math.pow(b, 2)) {
		System.out.println ("������� ����� b = " + b + " ������ �������� ����� a = " + a);
	}
}
}
