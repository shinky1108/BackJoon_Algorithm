package Chapter9_��ø_Ŭ������_��ø_�������̽�;

public class Outter2 {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// ��ø ��ü ���� 
			System.out.println(this.field);
			this.method();
			
			// �ٱ� ��ü ���� 
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
}
