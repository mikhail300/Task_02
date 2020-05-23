package by.htp.les04.branching;

// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
import static java.lang.Math.abs;
public class Task_30 {

	public static void task() {
	System.out.println ("task_30. 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.");
	
	
	double a, b, c;

	a = -2;
	b = 3;
	c = 0;

	if (a > b && b > c) {
		a = 2 * a;
		b = 2 * b;
		c = 2 * c;
	} else {
		a = abs(a);
		b = abs(b);
		c = abs(c);
	}

	System.out.println("тоговые значения a, b и c: " + a + ", " + b + ", " + c);
	}
	}

