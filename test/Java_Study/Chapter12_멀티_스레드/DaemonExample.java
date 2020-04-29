package Chapter12_멀티_스레드;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread asThread = new AutoSaveThread();
		asThread.setDaemon(true);
		asThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) { }
		System.out.println("메인 스레드 종료");
	}
}
