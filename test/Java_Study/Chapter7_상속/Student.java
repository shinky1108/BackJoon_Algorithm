package Chapter7_상속;

public class Student extends People{
	public int studenNo;
	
	public Student(String name, String ssn, int studentNo) {
		// 이게 없으면 부모의 기본 생성자가 없으니 다른 생성자를 명시적으로 호출하라는 오류가 발생!!!
		super(name, ssn); 	// 부모 생성자 호출!! 
		this.studenNo = studentNo;
	}
}
