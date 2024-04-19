package enums;


//static final DaillyDish  변수명들 
public enum DailyDish {//컴파일 시 Enum class와 상속관계로 객체가 생성된다.
	//상수 필드를 초기화 할수 있다
	//필드명("문자열")
	MONDAY("스파게티"),
	TUESDAY("짬뽕"), 
	WENDSDAY("볶음밥"),
	THURSDAY("탕수육"), 
	FRIDAY("잡채밥"),
	SATURDAY("마파두부"),
	SUNDAY("크림새우");
	
	//메서드 //생성자 존재
	
	
	
	private final String dish;	
	
	public String dish() {//메서드
		
		return dish;
	}
	
	DailyDish(String dish) {//생성자, 명시되어 있지 않아도 접근 제한자는 private
		//super()는 명시적으로 표현 불가능 - 개발자가 직접적을 관여할 필요가 없는 부분 
		//상수자체를 초기화하는데 사용된다.
		this.dish=dish;
	}

}
