package Chapter7_���;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		parent.method1();
		// �������̵��� �޼ҵ�� Ÿ�� ��ȯ ���Ŀ��� �ڽ� �޼ҵ尡 ȣ��!! 
		parent.method2();	// �����ǵ� �޼ҵ尡 ȣ���! 
		//parent.method3(); // ȣ�� �Ұ���! 
	}
}
