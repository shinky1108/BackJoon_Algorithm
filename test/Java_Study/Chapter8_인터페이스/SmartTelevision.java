package Chapter8_�������̽�;

public class SmartTelevision implements Search, RemoteControl{
	private int volume;
	
	public void turnOn(){
		System.out.println("����Ʈ Ƽ�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("����Ʈ Ƽ�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUEM) {
			this.volume = RemoteControl.MAX_VOLUEM;
		}else if (volume < RemoteControl.MIN_VOLUEM) {
			this.volume = RemoteControl.MIN_VOLUEM;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ����Ʈ Ƽ�� ����: "+volume);
	}
	
	public void search(String url) {
		System.out.println(url+"�˻��մϴ�.");
	}
}
