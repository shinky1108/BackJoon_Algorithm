package Chpater6_Ŭ����;

public class CCarExample {
	public static void main(String[] args) {
		CCar myCcar = new CCar();
		
		myCcar.setGas(5);
		
		boolean gasState = myCcar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCcar.run();
		}
		
		if(myCcar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
