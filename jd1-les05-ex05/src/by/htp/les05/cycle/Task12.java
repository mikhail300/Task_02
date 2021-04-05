package by.htp.les05.cycle;

public class Task12 {
// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
// нахождения произведения первых 10 членов этой последовательности.
	public static void task() {
		System.out.println("12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу\r\n"
						+ "нахождения произведения первых 10 членов этой последовательности.");

		long a = 1L;
		long mul = a;

		System.out.println();
		
		for (long i = 2L; i < 11L; i++) {

			a = a + 6L;
			mul = mul * a;

		}

		System.out.println("\t" + "Произведение = " + mul);
		System.out.println();
	}
}
