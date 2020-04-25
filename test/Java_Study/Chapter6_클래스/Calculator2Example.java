package Chpater6_클래스;

public class Calculator2Example {
	public static void main(String[] args) {
		// 정적 멤버로 선언된 것은 생성자를 호출하지 않아도 사용할 수 있음!
		//Calculator2 myCalc = new Calculator2();
		
		double result1 = 10*10*Calculator2.pi;
		int result2 = Calculator2.minus(10, 5);
		int result3 = Calculator2.plus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
