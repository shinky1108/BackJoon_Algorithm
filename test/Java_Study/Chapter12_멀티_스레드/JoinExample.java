package Chapter12_멀티_스레드;

// yield() : 다른 스레드에게 실행 양보 

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch(InterruptedException e) { }
		
		System.out.println("1~100 합: "+sumThread.getSum());
	}
}
