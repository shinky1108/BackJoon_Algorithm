package Chpater6_Ŭ����;

public class CCar {
	// �ʵ�
	int gas;
	
	// �������� �ʾƵ� �⺻ ������ �ڵ����� �������!
	
	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�: "+gas+")");
				gas-=1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�: "+gas+")");
				return; // return ���� ���� �޼ҵ忩�� return; ���� ���� ����! 
			}
		}
	}
}
