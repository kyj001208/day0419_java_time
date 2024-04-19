package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalendarTest02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("조회할 연월 정보 입력(ex> 202404)");

		int input = in.nextInt();

		int year = input / 100;
		int month = input % 100;

		//해당 연월의 1일 
		LocalDate firstDate = LocalDate.of(year, month, 1);
		int lastday = firstDate.lengthOfMonth();
		//해당 월의 마지막 정보 
		LocalDate lastDate = LocalDate.of(year, month, lastday);

		int dow = firstDate.getDayOfWeek().getValue();
		
	
		System.out.println("-------------------------------");
		System.out.println("SUN MON TUE WEN THE FIE SAT");
		System.out.println("-------------------------------");
		
		for(int i=0; i<dow; i++) {//공백 출력 코드
			
			System.out.print("    ");
		}

		//날짜 출력 
		for(LocalDate day=firstDate;! day.isAfter(lastDate);day=day.plusDays(1)) {
			
			System.out.printf("%3d ", day.getDayOfMonth());
			
			//토요일이면 줄바꿈해
			if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
				
				System.out.println();
			}
		
		}
	}

}
