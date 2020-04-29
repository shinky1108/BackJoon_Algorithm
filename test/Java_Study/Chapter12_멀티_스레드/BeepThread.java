package Chapter12_멀티_스레드;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	// 스레드 실행 내용 
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) { }
		}
	}
}
