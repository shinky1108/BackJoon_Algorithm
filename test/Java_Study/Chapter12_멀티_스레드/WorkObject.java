package Chapter12_��Ƽ_������;

// notify() : wait()�� ���� �Ͻ� ������ ������ �� �� ���� ���� ��� ���·� ���� 
// notifyAll() : wait()�� ���� �Ͻ� ������ ��� ��������� ���� ��� ���·� ���� 
// �� �޼ҵ���� ����ȭ ��� �������� ����� �� ���� 

// WorkObject�� methodA()�� methodB()�� ������ �ΰ�, �� ������ ThreadC�� ThreadD��
// ����� methodA()�� methodB()�� ȣ���ϵ��� �� 
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();		// �Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ���� 
		try {
			wait();		//ThreadA�� �Ͻ� ���� ���·� ����
		}catch (InterruptedException e) { }
	}
	
	public synchronized void methodB() {
		System.out.println("TreadB�� methodB() �۾� ����");
		notify();		// �Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ���� 
		try {
			wait();		// ThreadB�� �Ͻ� ���� ���·� ���� 
		} catch(InterruptedException e) { }
	}
}
