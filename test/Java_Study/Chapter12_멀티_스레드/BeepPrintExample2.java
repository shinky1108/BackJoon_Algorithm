package Chapter12_멀티_스레드;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// BeepTask 객체를 생성하고 
		Runnable beepTask = new BeepTask();
		// 작업 스레드를 생성함! 
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) { }
		}
	}
}
