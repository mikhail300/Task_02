package by.htp.les05.cycle;
// 20. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
public class Task_20 {
	public static void task() {
	System.out.println ("Task 20 20. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:");
	
	int i;
	i = 1;
	double sum;
	sum= 0;
	double elem;
	double e;
	e = 0.015;

	while (true) {

		elem = (double) 1 / ((3 * i - 2) * (3 * i + 1));
		System.out.println(elem);

		if (Math.abs(elem) < e) {
			break;
		}

		sum += elem;
		i++;
	}
	System.out.println("��������� = " + sum);
	}
	}

