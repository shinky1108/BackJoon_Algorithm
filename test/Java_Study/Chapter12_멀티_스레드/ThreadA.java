package Chapter12_멀티_스레드;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
		/*
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
		*/
	}

}
