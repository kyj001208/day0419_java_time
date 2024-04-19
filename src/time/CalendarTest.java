package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("조회할 연월 정보 입력(ex> 202404)");

		int input = in.nextInt();

		int year = input / 100;
		int month = input % 100;

		LocalDate firstDate = LocalDate.of(year, month, 1);
		int lastday = firstDate.lengthOfMonth();
		LocalDate lastDate = LocalDate.of(year, month, lastday);
		// System.out.println(firstDate.getDayOfWeek().getValue());//열거형

		int dow = firstDate.getDayOfWeek().getValue();
		
		// 1~7 : 1일 monday- 7sun
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("SUN MON TUE WEN THE FIE SAT");
		System.out.println("-------------------------------");

		for (int i = 0; i < dow; i++) {// 공백

			System.out.print("    ");
		}

		for (int day = 1; day <= lastday; day++, dow++) {// 줄바꿈

			if (dow % 7 == 0) {

				System.out.println();
			}

			System.out.printf("%3d ", day, dow);

		}
	
	}

}
