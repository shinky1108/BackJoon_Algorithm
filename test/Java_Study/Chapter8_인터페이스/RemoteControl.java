package Chapter8_�������̽�;

public interface RemoteControl {
	// ���
	public int MAX_VOLUEM = 10;
	public int MIN_VOLUEM = 0;
	
	// �޼ҵ�(�߻�) -> ����θ� �ۼ�!! 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�
	// ����Ʈ �޼ҵ�� �������̽��� ��������� ����� ��ü�� ������ �ִ� �ν��Ͻ� �޸���� �����ؾ� ��
	// public�� �����ص� �������� �� �ڵ����� public�� ���� 
	// ��ü�� �����Ǿ�� ����� �� ����! 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼ҵ� 
	// public Ư���� ���� ������ public�� �����ϴ��� �ڵ����� ������ �������� �ٰ� �� 
	// ���� �޼ҵ�� �ٷ� ȣ���� ���� 
	static void chageBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
