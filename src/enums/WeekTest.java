package enums;

public class WeekTest {

	public static void main(String[] args) {
		
		
		Week dow=Week.MON;		
		dow=Week.MON; //0
		dow=Week.TUE; //1
		dow=Week.WED; //2
		dow=Week.TUR; //3
		dow=Week.FRI; //4
		dow=Week.SAT; //5
		dow=Week.SUN; //6
		
		
		System.out.println(dow);
		System.out.println(dow.name());//필드를 문자열로
		System.out.println(dow.ordinal()); //필드를 숫자로

	}

} 
