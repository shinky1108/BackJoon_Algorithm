package Chapter8_�������̽�;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		System.out.println("----------------------");
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		System.out.println("----------------------");
		rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(8);
		System.out.println("----------------------");
		
		rc = new Audio();
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("----------------------");
		
		// ���� �޼ҵ�� �ٷ� ȣ���� ����! 
		RemoteControl.chageBattery();
		
	}
}
