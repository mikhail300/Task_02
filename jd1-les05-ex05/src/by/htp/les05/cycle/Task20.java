package by.htp.les05.cycle;

public class Task20 {
// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	public static void task() {
		System.out.println("20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:");
		
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

			elem = (double) 1 / ((3 * i - 2) * (3 * i + 1));
			//System.out.println(elem);

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
