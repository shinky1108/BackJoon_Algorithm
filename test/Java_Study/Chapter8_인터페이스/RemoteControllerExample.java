package Chapter8_인터페이스;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {System.out.println("람다식을 이용한 인터페이스 구현");};
			public void turnOff() {System.out.println("람다식을 이용한 인터페이스 구현");};
			public void setVolume(int volume) {System.out.println("현재 볼륨: "+volume);};
		};
	}
}
