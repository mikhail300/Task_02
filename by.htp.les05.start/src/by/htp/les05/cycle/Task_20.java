package by.htp.les05.cycle;
// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
public class Task_20 {
	public static void task() {
	System.out.println ("Task 20 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:");
	
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
	System.out.println("Результат = " + sum);
	}
	}

