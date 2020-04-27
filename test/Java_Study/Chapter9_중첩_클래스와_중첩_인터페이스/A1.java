package Chapter9_중첩_클래스와_중첩_인터페이스;

// 멤버 클래스에서 사용 제한 

public class A1 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		// 모든 필드와 메소드에 접근할 수 있음 
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
			// 인스턴스 필드와 메소드는 접근할 수 없음
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
