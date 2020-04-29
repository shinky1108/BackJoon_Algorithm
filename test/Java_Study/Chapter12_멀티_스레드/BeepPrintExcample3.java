package Chapter12_멀티_스레드;

public class BeepPrintExcample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) { }
		}
	}
}
