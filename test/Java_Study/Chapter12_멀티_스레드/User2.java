package Chapter12_��Ƽ_������;

public class User2 extends Thread{
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("CalculaotrUser2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
