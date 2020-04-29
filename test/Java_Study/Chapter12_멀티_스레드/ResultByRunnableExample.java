package Chapter12_��Ƽ_������;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.Future;

public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		// �۾� ���� 
		class Task implements Runnable{
			// �ܺ� Result ��ü�� �ʵ忡 ���� 
			Result result;
			Task(Result result){
				this.result = result;
			}
			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++) {
					sum+=i;
				}
				// Result ��ü�� �۾� ��� ���� 
				result.addValue(sum);
			}
		}
		// �� ���� �۾� ó���� ��û 
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result>future1 = exe.submit(task1, result);
		Future<Result>future2 = exe.submit(task2, result);
		
		try {
			// �� ���� �۾� ����� ���� 
			result = future1.get();
			result = future2.get();
			System.out.println("[ó�� ���] "+result.accumValue);
			System.out.println("[�۾� ó�� �Ϸ�]");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("[���� ���� �߻���] "+e.getMessage());
		}
		
		exe.shutdown();
	}
}

// ó�� ����� �����ϴ� Result Ŭ���� 
class Result{
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
