package Chapter12_��Ƽ_������;

public class ThreadD extends Thread{
	private WorkObject workObject;
	
	// ���� ��ü�� �Ű������� �޾� �ʵ忡 ���� 
	public ThreadD(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	// ���� ��ü�� methodB()�� 10�� �ݺ� ȣ�� 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
