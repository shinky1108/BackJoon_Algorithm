package Chapter8_인터페이스;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUEM = 10;
	public int MIN_VOLUEM = 0;
	
	// 메소드(추상) -> 선언부만 작성!! 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트 메소드
	// 디폴트 메소드는 인터페이스에 선언되지만 사실은 객체가 가지고 있는 인스턴스 메모드라고 생각해야 함
	// public을 생략해도 컴파일할 때 자동으로 public이 붙음 
	// 객체가 생성되어야 사용할 수 있음! 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드 
	// public 특성을 갖기 때문에 public을 생략하더라도 자동으로 컴파일 과정에서 붙게 됨 
	// 정적 메소드는 바로 호출이 가능 
	static void chageBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
