package by.htp.les04.branching;

import java.util.Scanner;

// 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
public class Task_23 {
	public static void task() {
	System.out.println ("task_23. 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.");

	Scanner in = new Scanner(System.in);

	System.out.print("������� ����� � �� 1 �� 31 ");
	int d = in.nextInt();

	System.out.print("������� ����� � �� 1 �� 12 ");
	int m = in.nextInt();

	in.close();

	if (d < 1 || d > 31 || m < 1 || m > 12) {
		System.out.println("������� ������������ ������.");
	} else {
		//System.out.println("������� ���������� ������.");
	}
}
}
