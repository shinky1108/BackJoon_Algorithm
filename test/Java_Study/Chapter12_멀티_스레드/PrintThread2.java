package Chapter12_��Ƽ_������;

// �����尡 ���� ��� or ���� ���¿� ���� �� interrupt() �޼ҵ尡 ����Ǹ� ��� InterruptedException ���ܰ� 
// �߻����� �ʰ�, �����尡 �̷��� �Ͻ� ���� ���°� �Ǹ� InterruptedException ���ܰ� �߻��� 
// ��, �����尡 �Ͻ� ���� ���°� ���� ������ interrupt() �޼ҵ� ȣ���� �ƹ��� �ǹ̰� ���� 

public class PrintThread2 extends Thread{
	public void run() {
		//try {
			while(true) {
				System.out.println("���� ��");
				//Thread.sleep(1);	// ª�� �ð��̳��� �Ͻ� ������Ű�� ���ؼ� ���! 
				if(Thread.interrupted()) {
					break;
				}
			}
		//}catch (InterruptedException e) { } 
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ���� ");
	}
}
