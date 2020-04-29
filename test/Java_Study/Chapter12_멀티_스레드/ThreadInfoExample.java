package Chapter12_멀티_스레드;

import java.util.Map;
import java.util.Set;

// thread 그룹 이름 얻기 

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread asThread = new AutoSaveThread();
		asThread.setName("AutoSaveThread");
		asThread.setDaemon(true);
		asThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name: "+ thread.getName()+((thread.isDaemon()?"(데몬)":"(주)")));
			System.out.println("\t"+"소속그룹: "+thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
