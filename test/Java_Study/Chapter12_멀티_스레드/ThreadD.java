package Chapter12_멀티_스레드;

public class ThreadD extends Thread{
	private WorkObject workObject;
	
	// 공유 객체를 매개값으로 받아 필드에 저장 
	public ThreadD(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	// 공유 객체의 methodB()를 10번 반복 호출 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
