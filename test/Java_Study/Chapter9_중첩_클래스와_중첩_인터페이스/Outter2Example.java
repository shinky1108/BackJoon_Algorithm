package Chapter9_중첩_클래스와_중첩_인터페이스;

public class Outter2Example {
	public static void main(String[] args) {
		// 중첩 클래스라 상위 클래스 먼저 만들어야 nested 객체를 사용 가능! 
		Outter2 out = new Outter2();
		Outter2.Nested nested = out.new Nested();
		nested.print();
	}
}
