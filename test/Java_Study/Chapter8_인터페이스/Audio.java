package Chapter8_�������̽�;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUEM) {
			this.volume = RemoteControl.MAX_VOLUEM;
		}else if (volume < RemoteControl.MIN_VOLUEM) {
			this.volume = RemoteControl.MIN_VOLUEM;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ����� ����: "+volume);
	}
	
	// ����Ʈ �޼ҵ� ������ 
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("����� ���� ó���մϴ�.");
		}else {
			System.out.println("����� ���� �����մϴ�.");
		}
	}
}
