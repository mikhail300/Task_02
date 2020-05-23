package by.htp.les04.branching;
// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
public class Task_16 {
	public static void task() {
	System.out.println ("task_16. 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).");
	
	double x;
	double y;
	x = - 2.0;
	y= -5.0;
	
	if (x > 0 && y > 0) {
		System.out.println("Точка (" + x + ", " + y + ") находится в 1 четверти");
	}else if (x < 0 && y > 0) {
		System.out.println("Точка (" + x + ", " + y + ") находится во 2 четверти");
	}else if (x < 0 && y < 0) {
		System.out.println("Точка (" + x + ", " + y + ") находится в 3 четверти");
	}else if (x > 0 && y < 0){
		System.out.println("Точка (" + x + ", " + y + ") находится в 4 четверти");
	}else if (x == 0 && y != 0){
		System.out.println("Точка (" + x + ", " + y + ") находится на оси y");
	}else if (x != 0 && y == 0){
		System.out.println("Точка (" + x + ", " + y + ") находится на оси x");
	}else if (x == 0 && y == 0){
		System.out.println("Точка (" + x + ", " + y + ") находится в начале координат");
	}
	
	}
}
