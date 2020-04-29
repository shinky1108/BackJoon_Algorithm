package Chapter12_멀티_스레드;

//yield() : 다른 스레드에게 실행 양보 

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// 스레드 A, B 모두 실행 
		threadA.start();
		threadB.start();
		
		// ThreadB만 실행 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.work = false;
		
		// ThreadA, ThreadB 모두 실행 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.work = true;
		
		// ThreadA, ThreadB 모두 종료 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.stop = true;
		threadB.stop = true;
	}
}
