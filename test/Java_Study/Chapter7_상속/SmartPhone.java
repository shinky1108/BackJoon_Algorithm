package Chapter7_상속;

public class SmartPhone extends Phone{
	// 생성자
	// 추상 클래스는 new 연산자로 객체를 만들 수는 없지만 자식 객체가 생성될 때 super를 호출해서 
	// 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 함!!! 
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
