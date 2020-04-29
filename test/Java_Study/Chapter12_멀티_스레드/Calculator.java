package Chapter12_멀티_스레드;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 동기화 하여 user1이 사용하는 동안 user2가 접근하지 못하게함! 
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {Thread.sleep(2000);} catch(InterruptedException e) { }
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
