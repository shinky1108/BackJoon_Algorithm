package Chapter12_��Ƽ_������;

public class ThreadExample {
	public static void main(String[] args) {
		// �� �ڵ带 �����ϴ� ������ ��ü ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: "+threadB.getName());
		threadB.start();
		
	}
}
