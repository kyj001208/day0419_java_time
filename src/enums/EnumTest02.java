package enums;

import java.util.Calendar;

public class EnumTest02 {

	public static void main(String[] args) {
		
		
		
		for(Week week: Week.values()) {
			
			System.out.println(week);
		}
		
		Week dow= Week.valueOf("SUN");
		
		System.out.println("문자열을 week 타입으로 변환 " + dow + dow.ordinal());
		
		
		
	}

}
