package Chapter12_��Ƽ_������;

// interrupt() : �����尡 �Ͻ� ���� ���¿� ���� �� InterruptedException ���ܸ� �߻���Ű�� ������ �� 
// �̰��� �̿��ϸ� run() �޼ҵ带 ���� �����ų �� ���� 

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) { }
		
		thread.interrupt();
	}
}
