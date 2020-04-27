package Chapter8_인터페이스;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUEM) {
			this.volume = RemoteControl.MAX_VOLUEM;
		}else if (volume < RemoteControl.MIN_VOLUEM) {
			this.volume = RemoteControl.MIN_VOLUEM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: "+volume);
	}
	
	// 디폴트 메소드 재정의 
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음 처리합니다.");
		}else {
			System.out.println("오디오 무음 해제합니다.");
		}
	}
}
