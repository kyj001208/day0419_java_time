package enums;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DailyDishRecommender {

	public static void main(String[] args) {
		
		LocalDate today=	LocalDate.now().minusDays(1);
		DayOfWeek dow= today.getDayOfWeek();
		
		DailyDish todayDish=DailyDish.valueOf(dow.name() );
		
		System.out.println("오늘의 추천 요리는 " +todayDish.dish());
	}

}
