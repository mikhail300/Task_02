package by.htp.les05.cycle;

public class Task19 {
// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	public static void task() {
		System.out.println("19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:");
		
		int i;
		i = 1;
		
		double sum;
		sum= 0;
		
		double elem;
		
		double e;
		e = 0.015;

		System.out.println("\t" + "e = " + e);
		System.out.println();
				
		while (true) {

			elem = (1.0 / Math.pow(2, i)) + (1.0 / Math.pow(3, i));

			if (Math.abs(elem) < e) {
				
				break;
				
			}

			sum += elem;
			i++;
			
		}
		
		System.out.println("\t" + "Результат: " + sum);
		System.out.println();
	}
}
