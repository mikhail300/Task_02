package by.htp.les05.cycle;
// 5. � ������� ��������� while �������� ��������� ����������� ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������.
public class Task_05 {
	public static void task() {
	System.out.println ("Task 05 5. � ������� ��������� while �������� ��������� ����������� ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������.");
	int i;
	i = 1;
	int s;
	s = 0;
	while (i <= 99) {
		s = s + i;
		//System.out.print (i + ", ");
		i = i + 2;
		
		
	}
	System.out.println ("����� �������� ����� �� 1 �� 99 ������������ = " + s);
	System.out.println ();
	}
}
