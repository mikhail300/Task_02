package by.htp.les04.branching;

public class Task34 {
// 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
	public static void task() {
		System.out.println("34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. ");
		System.out.println("Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»;");
		System.out.println("если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; ");
		System.out.println("если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.");
		
		int price;
		int sum;
		int extra;

		price = 35;
		sum = 40;

		System.out.println("\t" + "Стоимость книг " + price + "руб., сумма денег " + sum + "руб.");
		System.out.println();
		
		if (price == sum) {
			
			System.out.println("\t" + "Спасибо.");
			
		} else if (price > sum) {
			
			extra = price - sum;
			
			System.out.println("\t" + "Не достаточно  " + extra + " руб.");
			
		} else {
			
			extra = sum - price;
			
			System.out.println("\t" + "Возьмите сдачу, " + extra + " руб.");
			
		}	
		
		System.out.println();
	}
}
