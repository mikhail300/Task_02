package by.htp.les05.cycle;
// 8. ��������� �������� ������� �� ������� [�,b] c ����� h:
public class Task_08 {
	public static void task() {
	System.out.println ("Task 08 8. ��������� �������� ������� �� ������� [�,b] c ����� h:");
	int a;
	a = 10;
	int b;
	b = 16;
	int h;
	h = 1;
	int y;
	y = 0;
	int c;
	c = 1;
	while (a <= b) {
		
		//System.out.print (i + ", ");
		//i = i + 1;
		if (a == 15) {
			y = (a + c) * 2;
		}else if (a != 15) {
			y = (a - c) + 6 ;
		}
		System.out.println("��� � = " + a + " � = " + y);
		a = a + h;
	}
	
	System.out.println ();
	}
}
