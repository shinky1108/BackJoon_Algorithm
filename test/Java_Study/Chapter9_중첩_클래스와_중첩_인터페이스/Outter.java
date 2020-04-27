package Chapter9_중첩_클래스와_중첩_인터페이스;

// 로컬 클래스에서 사용 제한 

public class Outter {
	// 자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; (x)
		//localVariable = 100; (x)
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; (x)
		//localVariable = 100; (x)
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
