package Chapter12_��Ƽ_������;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread asThread = new AutoSaveThread();
		asThread.setDaemon(true);
		asThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) { }
		System.out.println("���� ������ ����");
	}
}
