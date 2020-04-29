package Chapter12_멀티_스레드;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
	}
}
