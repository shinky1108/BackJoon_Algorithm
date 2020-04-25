package Chpater6_클래스;

public class CCarExample {
	public static void main(String[] args) {
		CCar myCcar = new CCar();
		
		myCcar.setGas(5);
		
		boolean gasState = myCcar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCcar.run();
		}
		
		if(myCcar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
