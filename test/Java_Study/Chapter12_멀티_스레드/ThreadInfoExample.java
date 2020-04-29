package Chapter12_��Ƽ_������;

import java.util.Map;
import java.util.Set;

// thread �׷� �̸� ��� 

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread asThread = new AutoSaveThread();
		asThread.setName("AutoSaveThread");
		asThread.setDaemon(true);
		asThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name: "+ thread.getName()+((thread.isDaemon()?"(����)":"(��)")));
			System.out.println("\t"+"�Ҽӱ׷�: "+thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
