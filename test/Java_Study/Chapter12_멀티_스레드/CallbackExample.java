package Chapter12_멀티_스레드;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 콜백 방식의 작업 완료 통보받기 

public class CallbackExample {
	private ExecutorService exeService;
	
	public CallbackExample() {
		exeService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	// 콜백 메소드를 가진 CompletionHandler 객체 생성 
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>(){
		// Integer : 결과 타입, Void : 첨부 타입 
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행: "+result);
		}
		
		// Throwable : 예외 타입, Void : 첨부 타입
		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: "+exc.toString());
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);	// 정상 처리했을 경우 호출
				}catch(NumberFormatException e) {
					callback.failed(e, null);		// 예외가 발생했을 경우 호출
				}
			}
		};
		exeService.submit(task);	// 스레드풀에게 작업 처리 요청
	}
	
	public void finish() {
		exeService.shutdown();	// 스레드풀 종료 
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
}
