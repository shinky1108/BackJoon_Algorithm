package Chapter12_��Ƽ_������;

public class ThreadC extends Thread{
	private WorkObject workObject;
	
	// ���� ��ü�� �Ű������� �޾� �ʵ忡 ���� 
	public ThreadC(WorkObject workObject) {
		this.workObject = workObject;		// ���� ��ü�� �Ű������� �޾� �ʵ忡 ���� 
	}
	
	// ���� ��ü�� methodA()�� 10�� �ݺ� ȣ�� 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
