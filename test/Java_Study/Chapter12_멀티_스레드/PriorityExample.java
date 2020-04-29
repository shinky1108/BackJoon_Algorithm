package Chapter12_멀티_스레드;

public class PriorityExample {
	public static void main(String[] args) {
		// 우선순위를 10에 가장 높게 줬기 때문에 10이 가장 먼저 끝난다! 
		for(int i=0; i<=100; i++) {
			CalcThread calc = new CalcThread("thread"+i);
			if(i != 10) {
				calc.setPriority(Thread.MIN_PRIORITY);
			} else {
				calc.setPriority(Thread.MAX_PRIORITY);
			}
			calc.start();
		}
		
	}
}
