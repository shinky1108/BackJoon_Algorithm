package Chapter12_��Ƽ_������;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;

	public ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
		
		/*
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
		*/
	
	}
}
