package by.htp.les04.branching;
// 7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �
public class Task_07 {
	public static void task() {
	System.out.println ("task_07. 7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �");
	
	int a;
	int b;
	int c;
	int x;
	a = - 2;
	b = 3;
	c = 4;
	x = 3;
	
	int result;
	result = a*x*x + b*x + c;
	System.out.println ("��������� = " + result);
	if (result < 0) {
		result = - result;
	}
	
	System.out.println ("������ ��������� = " + result);
	}
}
