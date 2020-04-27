package Chapter8_인터페이스;

public class SmartTelevision implements Search, RemoteControl{
	private int volume;
	
	public void turnOn(){
		System.out.println("스마트 티비를 켭니다.");
	}
	public void turnOff() {
		System.out.println("스마트 티비를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUEM) {
			this.volume = RemoteControl.MAX_VOLUEM;
		}else if (volume < RemoteControl.MIN_VOLUEM) {
			this.volume = RemoteControl.MIN_VOLUEM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 티비 볼륨: "+volume);
	}
	
	public void search(String url) {
		System.out.println(url+"검색합니다.");
	}
}
