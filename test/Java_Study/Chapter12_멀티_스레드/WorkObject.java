package Chapter12_멀티_스레드;

// notify() : wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만듬 
// notifyAll() : wait()에 의해 일시 정지된 모든 스레드들을 실행 대기 상태로 만듬 
// 이 메소드들은 동기화 블록 내에서만 사용할 수 있음 

// WorkObject의 methodA()와 methodB()에 정의해 두고, 두 스레드 ThreadC와 ThreadD가
// 교대로 methodA()와 methodB()를 호출하도록 함 
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();		// 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬 
		try {
			wait();		//ThreadA를 일시 정지 상태로 만듬
		}catch (InterruptedException e) { }
	}
	
	public synchronized void methodB() {
		System.out.println("TreadB의 methodB() 작업 실행");
		notify();		// 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듬 
		try {
			wait();		// ThreadB를 일시 정지 상태로 만듬 
		} catch(InterruptedException e) { }
	}
}
