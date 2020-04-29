package Chapter12_��Ƽ_������;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) throws Exception{
		ExecutorService exe = Executors.newFixedThreadPool(2); // �ִ� ������ ������ 2�� ������Ǯ ���� 
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				// �۾� ����
				@Override
				public void run() {
					//������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) exe;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: "+poolSize+"] �۾� ������ �̸�: "+threadName);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
					
				}
			};
			// �۾� ó�� ��û 
			exe.execute(runnable);
			//exe.submit(runnable);
			
			Thread.sleep(10);
		}
		exe.shutdown();
	}
}
