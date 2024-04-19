package data;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		
		//Calendar today2=new GregorianCalendar();
		//System.out.println(today);

		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR); //년도 정보
		
		int month=today.get(Calendar.MONTH);
		int day=today.get(Calendar.DAY_OF_MONTH);
		int time=today.get(Calendar.MINUTE);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(time);
		

		//시간 요일 등 세부정보를 제공
		
	}

}
