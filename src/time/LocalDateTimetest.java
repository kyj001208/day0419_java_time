package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimetest {

	public static void main(String[] args) {
	
		LocalDateTime currDateTime=LocalDateTime.now();
		
		
		int year=currDateTime.getYear();
		Month month=currDateTime.getMonth();
		
		int monthValue=currDateTime.getMonthValue();
		int day=currDateTime.getDayOfMonth();
		
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(monthValue);
		System.out.println(day);
		
		//요일 -enum :상수 필드의 집합 (static final 이 붙으며 대문자로 표기하는 규칙)
		DayOfWeek dow=currDateTime.getDayOfWeek();
		System.out.println(dow);
		
		
		// 시간 정보
		int hour=currDateTime.getHour();
		int minute=currDateTime.getMinute();
		int second=currDateTime.getSecond();
		int nano=currDateTime.getNano();
		
		int doy=currDateTime.getDayOfYear();
		System.out.println("2024년 " +doy +"일 차");
		
		
		LocalDateTime targetDateTime=LocalDateTime.of(2024, 9, 13, 0, 0);
		
		System.out.println(targetDateTime);

	}

}
