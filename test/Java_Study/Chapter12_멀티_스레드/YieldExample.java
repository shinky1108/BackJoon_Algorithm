package Chapter12_��Ƽ_������;

//yield() : �ٸ� �����忡�� ���� �纸 

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// ������ A, B ��� ���� 
		threadA.start();
		threadB.start();
		
		// ThreadB�� ���� 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.work = false;
		
		// ThreadA, ThreadB ��� ���� 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.work = true;
		
		// ThreadA, ThreadB ��� ���� 
		try {Thread.sleep(3000);} catch(InterruptedException e) { }
		threadA.stop = true;
		threadB.stop = true;
	}
}
