package Chapter12_멀티_스레드;

// 스레드가 실행 대기 or 실행 상태에 있을 때 interrupt() 메소드가 실행되면 즉시 InterruptedException 예외가 
// 발생하지 않고, 스레드가 미래에 일시 정지 상태가 되면 InterruptedException 예외가 발생함 
// 즉, 스레드가 일시 정지 상태가 되지 않으면 interrupt() 메소드 호출은 아무런 의미가 없음 

public class PrintThread2 extends Thread{
	public void run() {
		//try {
			while(true) {
				System.out.println("실행 중");
				//Thread.sleep(1);	// 짧은 시간이나마 일시 정지시키기 위해서 사용! 
				if(Thread.interrupted()) {
					break;
				}
			}
		//}catch (InterruptedException e) { } 
		
		System.out.println("자원 정리");
		System.out.println("실행 종료 ");
	}
}
