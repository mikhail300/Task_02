package by.htp.les04.branching;

// 40. ��������� �������� �������:
public class Task_40 {

	public static void task() {
	System.out.println ("task_40. 40. ��������� �������� �������:");
	double x;
	double y;
	
	x = 1;

	if (x <= 13) {
		y = -Math.pow(x, 3) + 9;
	} else {
		y = -3 / (x + 1);
	}

	System.out.println("F(x = " + x + ") = " + y);
	}
}
