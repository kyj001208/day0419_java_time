package enums;

import java.util.Calendar;

public class EnumTest01 {

	public static void main(String[] args) {
		
		
		Week today=null;
		
		Calendar calendar=Calendar.getInstance();
		
		int dow=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(dow);
		
		switch(dow) {
		
		case 1:today=Week.SUN; break;
		case 2:today=Week.MON; break;
		case 3:today=Week.TUE; break;
		case 4:today=Week.WED; break;
		case 5:today=Week.TUR; break;
		case 6:today=Week.FRI; break;
		case 7:today=Week.SAT; break;
		
		
		}

		System.out.println("오늘의 요일 : " + today + "day");
		
		
	}

}
