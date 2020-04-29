package Chapter12_��Ƽ_������;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		// newFixedThreadPool(int nThreads) : ������Ǯ�� �ʱ� ������ ������ 0���̰�, �ھ� ������ ���� nThreads
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++) {sum +=i;}
				System.out.println("[ó�� ���] "+sum);
			}
		};
		Future future = exe.submit(runnable);
		
		try {
			// �۾� ó���� ���������� �Ϸ�Ǿ��ٸ� Future�� get() �޼ҵ�� null�� ���� 
			// �����尡 �۾� ó�� ���� interrupt�Ǹ� InterruptedException�� �߻���Ŵ 
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(Exception e) {
			System.out.println("[���� ���� �߻���] "+e.getMessage());
		}
		exe.shutdown();
		
	}
}
