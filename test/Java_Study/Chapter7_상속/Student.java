package Chapter7_���;

public class Student extends People{
	public int studenNo;
	
	public Student(String name, String ssn, int studentNo) {
		// �̰� ������ �θ��� �⺻ �����ڰ� ������ �ٸ� �����ڸ� ��������� ȣ���϶�� ������ �߻�!!!
		super(name, ssn); 	// �θ� ������ ȣ��!! 
		this.studenNo = studentNo;
	}
}
