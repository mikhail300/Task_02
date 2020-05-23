package by.htp.les05.cycle;
// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
public class Task_19 {
	public static void task() {
	System.out.println ("Task 19 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:");
	
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
	System.out.println("Результат = " + sum);
	}
	}

