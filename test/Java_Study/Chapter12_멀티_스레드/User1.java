package Chapter12_��Ƽ_������;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("CalculaotrUser1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
