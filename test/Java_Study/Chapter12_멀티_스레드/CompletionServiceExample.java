package Chapter12_��Ƽ_������;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// �۾� �Ϸ� ������ �뺸 �ޱ� 

public class CompletionServiceExample extends Thread{
	public static void main(String[] args) {
		// CompletionService ���� 
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(exe);
	
		System.out.println("[�۾� ó�� ��û]");
		for(int i=0; i<3; i++) {
			// ������Ǯ���� �۾� ó�� ��û 
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception{
					int sum=0;
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		System.out.println("[ó�� �Ϸ�� �۾� Ȯ��]");
		// ������Ǯ�� �����忡�� �����ϵ��� �� 
		exe.submit(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						// �Ϸ�� �۾� �������� 
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("[ó�� ���] "+value);
					}catch(Exception e) {
						break;
					}
				}
			}
		});
		
		// 3�� �� ������Ǯ ���� 
		try {Thread.sleep(3000);}
		catch(InterruptedException e) { }
		exe.shutdown();
	}
}
