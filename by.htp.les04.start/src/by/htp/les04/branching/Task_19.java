package by.htp.les04.branching;
// 19. ���������� ���������� ������������� ����� ����� �, b, �.
public class Task_19 {
	public static void task() {
	System.out.println ("task_19. 19. ���������� ���������� ������������� ����� ����� �, b, �.");
	
	int a;
	int b;
	int c;
	a = -3;
	b = 6;
	c = -3;
	int count;
	count = 0;
	
	if (a >= 0) {
		count++;
	}
	if (b >= 0) {
		count++;
	}
	if (c >= 0) {
		count++;
	}

	System.out.println("����� ����� " + a + ", " + b + ", " + c + " ���������� �������������: " + count);
	
	}
}
