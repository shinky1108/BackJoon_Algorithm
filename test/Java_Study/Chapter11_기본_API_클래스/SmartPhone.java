package Chapter11_�⺻_API_Ŭ����;

// �� ����� toString() �������غ���!

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + "," + os;
	}
}
