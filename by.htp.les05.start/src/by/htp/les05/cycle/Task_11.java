package by.htp.les05.cycle;
// 11. ��������� ��������� ���������� �������� ����� ������ ������� �����
public class Task_11 {
	public static void task() {
	System.out.println ("Task 11 11. ��������� ��������� ���������� �������� ����� ������ ������� �����	");
	
	int a = 0;
	int diff = 0;
		
	while (a <= 200) {
		diff -= (int) Math.pow(a, 3);
		a++;
	}
		
	System.out.println("�������� ����� = " + diff);
	}
}
