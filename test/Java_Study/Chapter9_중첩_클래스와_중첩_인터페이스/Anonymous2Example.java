package Chapter9_중첩_클래스와_중첩_인터페이스;

public class Anonymous2Example {
	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(
				// 매개값
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
	}
}
