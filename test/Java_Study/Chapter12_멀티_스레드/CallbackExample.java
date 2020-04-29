package Chapter12_��Ƽ_������;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// �ݹ� ����� �۾� �Ϸ� �뺸�ޱ� 

public class CallbackExample {
	private ExecutorService exeService;
	
	public CallbackExample() {
		exeService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	// �ݹ� �޼ҵ带 ���� CompletionHandler ��ü ���� 
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>(){
		// Integer : ��� Ÿ��, Void : ÷�� Ÿ�� 
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() ����: "+result);
		}
		
		// Throwable : ���� Ÿ��, Void : ÷�� Ÿ��
		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() ����: "+exc.toString());
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
					callback.completed(result, null);	// ���� ó������ ��� ȣ��
				}catch(NumberFormatException e) {
					callback.failed(e, null);		// ���ܰ� �߻����� ��� ȣ��
				}
			}
		};
		exeService.submit(task);	// ������Ǯ���� �۾� ó�� ��û
	}
	
	public void finish() {
		exeService.shutdown();	// ������Ǯ ���� 
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "��");
		example.finish();
	}
}
