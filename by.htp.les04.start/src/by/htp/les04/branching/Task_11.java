package by.htp.les04.branching;
// 11. ��������� ���������, ������� ��������� ������� ������ ������������ ������.
public class Task_11 {
	public static void task() {
	System.out.println ("task_11. 11. ��������� ���������, ������� ��������� ������� ������ ������������ ������.");
	
	double a1 = 4;
	double b1 = 4;
	double c1 = 4;
	double a2 = 5;
	double b2 = 5;
	double c2 = 5;

	double p1 = (a1 + b1 + c1) / 2;
	double p2 = (a2 + b2 + c2) / 2;

	double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
	double s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

	if (s1 < s2) {
		System.out.println("������� ������������ 2 ������ ������� ������������ 1");
	} else if (s2 < s1){
		System.out.println("������� ������������ 1 ������ ������� ������������ 2");
	} 
}
}
