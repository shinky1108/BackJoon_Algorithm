package Chapter12_��Ƽ_������;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// ����ȭ �Ͽ� user1�� ����ϴ� ���� user2�� �������� ���ϰ���! 
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {Thread.sleep(2000);} catch(InterruptedException e) { }
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
