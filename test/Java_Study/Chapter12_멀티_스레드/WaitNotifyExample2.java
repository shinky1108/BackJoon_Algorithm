package Chapter12_��Ƽ_������;

public class WaitNotifyExample2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread pThread = new ProducerThread(dataBox);
		ConsumerThread cThread = new ConsumerThread(dataBox);
		
		pThread.start();
		cThread.start();
	}
}
