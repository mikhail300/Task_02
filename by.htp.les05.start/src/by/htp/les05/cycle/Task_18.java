package by.htp.les05.cycle;
// 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
public class Task_18 {
	public static void task() {
	System.out.println ("Task 18 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:");
	
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
	System.out.println("Результат = " + sum);
	}
	}

