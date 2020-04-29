package Chapter12_멀티_스레드;

import java.awt.Toolkit;
// 메인 스레드만 이용한 경우 
// 비프음이 울리고 -> '띵'이 Print! 

public class BeepPrintExample1 {
	public static void main(String[] args) {
		// Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) { }
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
