package Chapter11_기본_API_클래스;

// 내 맘대로 toString() 재정의해보기!

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
