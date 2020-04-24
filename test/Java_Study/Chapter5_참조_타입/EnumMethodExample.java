package Chapter5_참조_타입;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		// name() : 열거 객체가 가지고 있는 문자열을 리턴
		String name = today.name(); 
		System.out.println(name);
		
		// 전체 열거 객체 중 몇 번째 열거 객체인지 알려줌 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// 몇 번째 위치하는지를 비교 
		// 빠르면 음수, 늦으면 양수! 
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		System.out.println(res1);
		System.out.println(res2);
		
		// valueOf() : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴함 
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말입니다.");
			}else {
				System.out.println("평일이다.");
			}
		}
		
		// values() : 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴 
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
