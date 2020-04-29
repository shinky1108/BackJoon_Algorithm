package Chapter12_멀티_스레드;

// interrupt() : 스레드가 일시 정지 상태에 있을 때 InterruptedException 예외를 발생시키는 역할을 함 
// 이것을 이용하면 run() 메소드를 정상 종료시킬 수 있음 

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) { }
		
		thread.interrupt();
	}
}
