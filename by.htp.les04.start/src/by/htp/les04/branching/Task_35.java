package by.htp.les04.branching;

// 35. Вычислить число и месяц в невисокосном году по номеру дня.
public class Task_35 {

	public static void task() {
	System.out.println ("task_35. 35. Вычислить число и месяц в невисокосном году по номеру дня.");
	int day;
	int date;
	int month;

	day = 263;
	date = 0;
	month = 0;

	if (day >= 1 && day <= 31) {
		date = day;
		month = 1;
	} else if (day >= 32 && day <= 59) {
		date = day - 31;
		month = 2;
	} else if (day >= 60 && day <= 90) {
		date = day - 59;
		month = 3;
	} else if (day >= 91 && day <= 120) {
		date = day - 90;
		month = 4;
	} else if (day >= 121 && day <= 151) {
		date = day - 120;
		month = 5;
	} else if (day >= 152 && day <= 181) {
		date = day - 151;
		month = 6;
	} else if (day >= 182 && day <= 212) {
		date = day - 181;
		month = 7;
	} else if (day >= 213 && day <= 243) {
		date = day - 212;
		month = 8;
	} else if (day >= 244 && day <= 274) {
		date = day - 243;
		month = 9;
	} else if (day >= 275 && day <= 304) {
		date = day - 274;
		month = 10;
	} else if (day >= 305 && day <= 335) {
		date = day - 304;
		month = 11;
	} else if (day >= 336 && day <= 365) {
		date = day - 335;
		month = 12;
	} else {
		System.out.println("Нет такого дня.");
	}

	System.out.println("Сегодня " + date + "." + month );
	}
}
