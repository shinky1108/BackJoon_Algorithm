package Chapter12_��Ƽ_������;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// BeepTask ��ü�� �����ϰ� 
		Runnable beepTask = new BeepTask();
		// �۾� �����带 ������! 
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch (Exception e) { }
		}
	}
}
