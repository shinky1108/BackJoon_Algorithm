package Chapter12_��Ƽ_������;

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
				System.out.println("ThreadA �۾� ����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
		/*
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
		*/
	}

}
