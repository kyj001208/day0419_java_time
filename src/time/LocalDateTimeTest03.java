package time;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class LocalDateTimeTest03 {

	public static void main(String[] args) {
	
		//날짜와 시간 비교하기
		//until(): 날짜, 시간차이 

		
		LocalDateTime start=LocalDateTime.of(2024, 04,19,9,0,0);
		LocalDateTime end=start.plusHours(12);
		System.out.println("종료시간: " + end);
		
		//현재 시간
		LocalDateTime now= LocalDateTime.now().withNano(0);
		System.out.println("현재시간: " + now);
		
		
		//남은시간 
		Temporal temporal=end;
		
		long remainhour=now.until(temporal,ChronoUnit.HOURS);
		long remainminute=now.until(temporal,ChronoUnit.MINUTES);
		long remainseconds=now.until(temporal,ChronoUnit.SECONDS);
		
		
		System.out.printf("남은시간 %02d:%02d:%02d\n",remainhour, remainminute%60, remainseconds%60);
		System.out.println("-----------------------------");
		
		end=now.plusMonths(1).withDayOfMonth(30);
		
		//Period 년 월일 D-day 표현할때 사용 : LocalDate를 활용해서 사용
		//기간을 제공
		Period period=Period.between(now.toLocalDate(), end.toLocalDate());
		
		int yearPeriod=period.getYears();
		System.out.println(yearPeriod +"년");
		int monthPeriod=period.getMonths();
		System.out.println(monthPeriod +"달");
		int dayPeriod=period.getDays();
		System.out.println(dayPeriod + "일");
		System.out.println("------------------------------------");
		
		// Duration : 시분초, 나노초의 D-day를 구할때 사용
		Duration duration=Duration.between(start.toLocalTime(), end.toLocalTime());
		
		System.out.println("남은 초 : "+ duration.getSeconds())  ;
		
		//Timestamp timestamp=Timestamp.valueOf(start);
		
		
	}

}
