package Chapter8_�������̽�;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {System.out.println("���ٽ��� �̿��� �������̽� ����");};
			public void turnOff() {System.out.println("���ٽ��� �̿��� �������̽� ����");};
			public void setVolume(int volume) {System.out.println("���� ����: "+volume);};
		};
	}
}
