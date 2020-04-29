package Chapter12_멀티_스레드;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		// newFixedThreadPool(int nThreads) : 스레드풀의 초기 스레드 개수는 0개이고, 코어 스레드 수는 nThreads
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++) {sum +=i;}
				System.out.println("[처리 결과] "+sum);
			}
		};
		Future future = exe.submit(runnable);
		
		try {
			// 작업 처리가 정상적으로 완료되었다면 Future의 get() 메소드는 null을 리턴 
			// 스레드가 작업 처리 도중 interrupt되면 InterruptedException을 발생시킴 
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함] "+e.getMessage());
		}
		exe.shutdown();
		
	}
}
