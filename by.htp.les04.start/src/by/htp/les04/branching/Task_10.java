package by.htp.les04.branching;
// 10. ��������� ���������, ������� ��������� ������� ������ ����� ������.
public class Task_10 {
	public static void task() {
		System.out.println ("task_10. 10. ��������� ���������, ������� ��������� ������� ������ ����� ������.");
		
		double r1;
		double r2;
		
		r1 = 4;
		r2 = 3;
		
		
		if ((Math.PI * r1 * r1) < (Math.PI * r2 * r2)) {
			System.out.println ("������� ����� � �������� r1 = " + r1 + " ������ ����� � �������� r2 =" + r2);
		}else if ((Math.PI * r1 * r1) > (Math.PI * r2 * r2)){
			System.out.println ("������� ����� � �������� r2 = " + r2 + " ������ ����� � �������� r1 =" + r1);
		}
}
}
