package Chapter12_��Ƽ_������;

public class PriorityExample {
	public static void main(String[] args) {
		// �켱������ 10�� ���� ���� ��� ������ 10�� ���� ���� ������! 
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
