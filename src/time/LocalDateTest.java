package time;

import java.time.Instant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate curreDate = LocalDate.now(); // 현재 날짜 정보를 제공
		LocalTime curreTime = LocalTime.now(); // 현재 시간 정보를 제공 (나노타임의 초를 제공)

		System.out.println(curreDate);
		System.out.println(curreTime);

		LocalDateTime curr = LocalDateTime.of(curreDate, curreTime); // LocalDateTime 병합도 가능

		LocalDateTime today = LocalDateTime.now();// 현재 날짜 & 시간 정보 모두 제공
		System.out.println(today);

		LocalDate date = today.toLocalDate(); // LocalDateTime은 세분화를 각각 할수 있다
		LocalTime time = today.toLocalTime();

		System.out.println(date);
		System.out.println(time);

		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone);

		ZonedDateTime londonZone = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonZone);

		ZonedDateTime seoulZone = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulZone);
		
		

		// Instant : 날짜와 시간의 정보를 얻거나 조각하는데 사용되지 않고, 특정 시점의 타임스탬프로 사용한다.
		// 특정한 두 시간 간의 시간적 우선순위를 따질때 사용한다.(비교)
		
		
		Instant instant1=Instant.now();
		Instant instant2=Instant.now();
	
	
		if(instant1.isAfter(instant2)) {
			
			System.out.println("instant1 이 뒤에 오는 날짜에오");
			
		}else if(instant1.isBefore(instant2)){
			
			System.out.println("instant1 이 빠릅니다");
			
		}else {
			
			System.out.println("instant1와 instant2 동일 시간 ");
		}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
