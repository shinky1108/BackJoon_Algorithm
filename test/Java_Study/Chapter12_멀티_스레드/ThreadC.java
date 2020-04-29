package Chapter12_멀티_스레드;

public class ThreadC extends Thread{
	private WorkObject workObject;
	
	// 공유 객체를 매개값으로 받아 필드에 저장 
	public ThreadC(WorkObject workObject) {
		this.workObject = workObject;		// 공유 객체를 매개값으로 받아 필드에 저장 
	}
	
	// 공유 객체의 methodA()를 10번 반복 호출 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
