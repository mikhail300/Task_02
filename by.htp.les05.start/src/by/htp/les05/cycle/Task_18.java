package by.htp.les05.cycle;
// 18. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
public class Task_18 {
	public static void task() {
	System.out.println ("Task 18 18. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:");
	
	int i;
	i = 1;
	double sum;
	sum = 0;
	double elem;
	double e;
	e = 0.001;

	while (true) {

		elem = Math.pow(-1, i - 1) / i;

		if (Math.abs(elem) < e) {
			break;
		}

		sum += elem;
		i++;
	}
	System.out.println("��������� = " + sum);
	}
	}

