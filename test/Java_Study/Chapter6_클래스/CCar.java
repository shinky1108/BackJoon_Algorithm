package Chpater6_클래스;

public class CCar {
	// 필드
	int gas;
	
	// 선언하지 않아도 기본 생성자 자동으로 만들어짐!
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다.(gas잔량: "+gas+")");
				return; // return 값이 없는 메소드여도 return; 으로 강제 종료! 
			}
		}
	}
}
