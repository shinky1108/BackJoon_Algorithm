package Chapter9_��ø_Ŭ������_��ø_�������̽�;

public class Outter2Example {
	public static void main(String[] args) {
		// ��ø Ŭ������ ���� Ŭ���� ���� ������ nested ��ü�� ��� ����! 
		Outter2 out = new Outter2();
		Outter2.Nested nested = out.new Nested();
		nested.print();
	}
}
