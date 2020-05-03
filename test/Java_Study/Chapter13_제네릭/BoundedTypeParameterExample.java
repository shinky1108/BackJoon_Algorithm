package Chapter13_제네릭;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = UUtil.compare("a", "b"); // String은 Number 타입이 아니기 때문에 오류 
		
		int result1 = UUtil.compare(10, 20);
		System.out.println(result1);
		
		int result2 = UUtil.compare(4.5, 3);
		System.out.println(result2);
	}
}
