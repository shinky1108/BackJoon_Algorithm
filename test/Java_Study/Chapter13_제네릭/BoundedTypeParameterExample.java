package Chapter13_���׸�;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = UUtil.compare("a", "b"); // String�� Number Ÿ���� �ƴϱ� ������ ���� 
		
		int result1 = UUtil.compare(10, 20);
		System.out.println(result1);
		
		int result2 = UUtil.compare(4.5, 3);
		System.out.println(result2);
	}
}
