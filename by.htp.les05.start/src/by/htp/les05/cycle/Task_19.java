package by.htp.les05.cycle;
// 19. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
public class Task_19 {
	public static void task() {
	System.out.println ("Task 19 19. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:");
	
	int i;
	i = 1;
	double sum;
	sum= 0;
	double elem;
	double e;
	e = 0.015;

	while (true) {

		elem = (1.0 / Math.pow(2, i)) + (1.0 / Math.pow(3, i));

		if (Math.abs(elem) < e) {
			break;
		}

		sum += elem;
		i++;
	}
	System.out.println("��������� = " + sum);
	}
	}

