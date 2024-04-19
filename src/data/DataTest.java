package data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;


public class DataTest {
	
	public static void main(String[] args) {
		
		
		Date date =new Date() ;
		
		System.out.println(date);
		
		
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String str=format.format(date);
		System.out.println(str);
		
		
		//Calendar cal; //달력을 표현한 클래스
		
		
		
	}

}
