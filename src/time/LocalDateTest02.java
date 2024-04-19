package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest02 {

	public static void main(String[] args) {

		// 날짜와 시간을 변경하기

		LocalDateTime now = LocalDateTime.now(); // 현재 시간 기준이라는 뜻

		System.out.println(now.plusDays(1));// 오늘날짜의 1을 더하면 내일 날짜 확인

		System.out.println(now.minusDays(1));// 오늘날짜의 1을 빼면 어제 날짜 확인

		LocalDateTime lastDay = now.plusYears(1).minusDays(1); // 내년의 하루 전 이라는 뜻

		System.out.println(lastDay);

		// with()메서드를 통해서 변경 가능

		LocalDateTime targetDateTime = now.withYear(2002);// 오늘 날짜기준으로 년도를 2002으로 변경

		System.out.println(targetDateTime);

		targetDateTime = now.withHour(0).withMinute(0).withSecond(0).withNano(0);

		System.out.println(targetDateTime);

		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear()); // 시간을 거스르는 기능(올해 처음으로 돌아감)

		System.out.println(targetDateTime);

		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear()); // 시간을 거스르는 기능(올해 처음으로 돌아감)

		System.out.println(targetDateTime);

		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());

		System.out.println(targetDateTime);

		// 다음달의 첫번째 수요일은 몇일이니?

		targetDateTime = now.plusMonths(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY)); // 5월 첫번째 수요일은
																										// 몇일이니?

		System.out.println(targetDateTime);

		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // 돌아오는 금요일은 몇일이니?

		System.out.println(targetDateTime);

		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)); // 저번주 토요일은 몇일이니?

		System.out.println(targetDateTime);
		
		
		targetDateTime = now.plusMonths(1).withDayOfMonth(1).minusDays(1);
		
		System.out.println(targetDateTime);

		
		
		
		
		
		
		
		
		
		
		
	}

}
